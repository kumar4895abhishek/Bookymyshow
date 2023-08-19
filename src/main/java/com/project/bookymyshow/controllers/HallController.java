package com.project.bookymyshow.controllers;


import com.project.bookymyshow.services.HallService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HallController
{
    public HallService hallService;

}
