package com.project.bookymyshow.controllers;


import com.project.bookymyshow.services.TheatreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TheatreController
{
    public TheatreService theatreService;
}
