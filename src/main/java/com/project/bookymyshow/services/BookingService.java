package com.project.bookymyshow.services;


import com.project.bookymyshow.dtos.CreateBookingRequest;
import com.project.bookymyshow.enums.BookingStatus;
import com.project.bookymyshow.enums.SeatStatus;
import com.project.bookymyshow.models.Booking;
import com.project.bookymyshow.models.Show;
import com.project.bookymyshow.models.ShowSeat;
import com.project.bookymyshow.models.User;
import com.project.bookymyshow.repositories.BookingRepository;
import com.project.bookymyshow.repositories.ShowSeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class BookingService
{

    private BookingRepository bookingRepository;

    private UserService userService;

    private ShowService showService;

    private ShowSeatRepository showSeatRepository;

    //@Transactional( isolation = Isolation.SERIALIZABLE)
    public Booking createBooking( CreateBookingRequest createBookingRequest)
    {

        // Step 1 - get the user through id
        // if user not present throw error

        User user=userService.getUser(createBookingRequest.getUserId());
        if(user==null)
        {
            throw  new NoSuchElementException("INVALID USER ID "+createBookingRequest.getUserId());
        }

        //Step 2 - get show through show id
        // if show is not present

        Show show=showService.getShow(createBookingRequest.getShowId());

        //Step 3 - get the show seat through showseat id
        //Step 4 - check if all the seats are available

        List<ShowSeat> showSeats=showSeatRepository.findAllById(createBookingRequest.getShowSeatId());

        for(ShowSeat seat:showSeats)
        {
            if(seat.getStatus() != SeatStatus.AVAILABLE)
            {
                throw new InvalidParameterException("SEATS NOT AVAILABLE ");
            }
        }


        //Step 5 - block the seats mark locked

        for(ShowSeat seat:showSeats)
        {
            seat.setStatus(SeatStatus.LOCKED);
        }

        List<ShowSeat> savedSeats=showSeatRepository.saveAll(showSeats);



        //Step 6 - calc amount
        // Apply Strategy Design pattern multiple way to calculate

        Double amount=null;

        //Step 7 - create and save the booking

        Booking booking=Booking.builder()
                .user(user)
                .show(show)
                .seats(showSeats)
                .amount(amount)
                .bookingStatus(BookingStatus.PENDING)
                .bookedAt(new Date())
                .build();


        return bookingRepository.save(booking);

    }
}
