package com.project.bookymyshow.controllers;

import com.project.bookymyshow.models.Seat;
import com.project.bookymyshow.services.SeatService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SeatController
{
   // @Autowired
    public SeatService seatService;

    private static final Logger logger = LoggerFactory.getLogger(SeatController.class);



    @PostMapping("/seat")
    public Seat createSeat(@RequestBody Seat seat)
    {
        logger.info("Received request with seat: {}", seat);

        System.out.println("SEAT DATA IS "+seat.getColNumber());
        Seat seatCreated=seatService.createSeat(seat);

        return seatCreated;
    }

}
