package com.project.bookymyshow.services;

import com.project.bookymyshow.dtos.CreateMovieRequest;
import com.project.bookymyshow.models.Movie;
import com.project.bookymyshow.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class MovieService
{

    private MovieRepository movieRepository;

    public Movie createMovie(CreateMovieRequest createMovieRequest)
    {
        Movie movie= Movie.builder()
                .name(createMovieRequest.getName())
                .rating(createMovieRequest.getRating())
                .build();

            return movieRepository.save(movie);

    }

    public CreateMovieRequest searchMovieById(Long id) {
        System.out.println("MOVIE ID RECEIVED IS SERVICE " + id);

        Movie movie = movieRepository.findById(id).orElseThrow(() -> new NoSuchElementException("NO ID FOUND " + id));
        return convertToDTO(movie);
    }

    private CreateMovieRequest convertToDTO(Movie movie) {
        CreateMovieRequest dto = new CreateMovieRequest();
        dto.setName(movie.getName());
        dto.setRating(movie.getRating());
        dto.setLanguages(movie.getLanguages());
        dto.setMovieFeatures(movie.getMovieFeatures());
        return dto;
    }

}
