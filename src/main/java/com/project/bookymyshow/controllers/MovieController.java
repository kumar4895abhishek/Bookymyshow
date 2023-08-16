package com.project.bookymyshow.controllers;


import com.project.bookymyshow.dtos.CreateMovieRequest;
import com.project.bookymyshow.models.Movie;
import com.project.bookymyshow.services.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@AllArgsConstructor
public class MovieController
{

    private MovieService movieService;


    @PostMapping("/movie")
    public Movie createMovie(@RequestBody CreateMovieRequest createMovieRequest)
    {
            return movieService.createMovie(createMovieRequest);

    }


    @GetMapping("/getmoviebyid/{id}")
    public ResponseEntity<CreateMovieRequest> getMovieById(@PathVariable Long id) {
        try
        {
            CreateMovieRequest movieDTO = movieService.searchMovieById(id);
            return ResponseEntity.ok(movieDTO);
        }
        catch (NoSuchElementException ex)
        {
            return ResponseEntity.notFound().build();
        }
    }

}
