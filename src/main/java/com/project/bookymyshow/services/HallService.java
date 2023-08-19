package com.project.bookymyshow.services;


import com.project.bookymyshow.repositories.HallRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HallService
{
    public HallRepository hallRepository;

}
