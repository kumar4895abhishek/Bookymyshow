package com.project.bookymyshow.controllers;


import com.project.bookymyshow.dtos.CreateBookingRequest;
import com.project.bookymyshow.models.Booking;
import com.project.bookymyshow.services.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookingController
{

    private BookingService bookingService;
    //Create a booking
    @PostMapping("/booking")
    public Booking createBooking(@RequestBody CreateBookingRequest createBookingRequest)
    {

        return  bookingService.createBooking(createBookingRequest);

    }
}
