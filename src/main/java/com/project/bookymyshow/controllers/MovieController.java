package com.project.bookymyshow.controllers;


import com.project.bookymyshow.dtos.CreateMovieRequest;
import com.project.bookymyshow.models.Movie;
import com.project.bookymyshow.services.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public Movie getMovieById(@PathVariable Long id) {

            Movie movie = movieService.searchMovieById(id);
            return movie;


    }

}
