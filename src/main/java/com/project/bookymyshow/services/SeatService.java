package com.project.bookymyshow.services;


import com.project.bookymyshow.models.Seat;
import com.project.bookymyshow.repositories.SeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SeatService
{
    public SeatRepository seatRepository;
    public Seat createSeat( Seat seat)
    {

        return seatRepository.save(seat);

    }

}
