package com.project.bookymyshow.controllers;


import com.project.bookymyshow.models.Theatre;
import com.project.bookymyshow.services.TheatreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TheatreController
{
    public TheatreService theatreService;


    @PostMapping("/theatre")
    public Theatre createTheatre(@RequestBody  Theatre theatre)
    {
        return theatreService.createTheatre( theatre);
    }
}
