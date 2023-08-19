package com.project.bookymyshow.services;


import com.project.bookymyshow.repositories.TheatreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TheatreService
{
    public TheatreRepository theatreRepository;
}
