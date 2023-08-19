package com.project.bookymyshow.controllers;


import com.project.bookymyshow.models.Hall;
import com.project.bookymyshow.services.HallService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HallController
{
    public HallService hallService;

    @PostMapping("/hall")
    public Hall createHall(@RequestBody  Hall hall)
    {

        System.out.print("HALL NAME IS "+hall.getHallName());
        return hallService.createHall(hall);
    }

}
