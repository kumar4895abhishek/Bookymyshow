package com.project.bookymyshow.services;


import com.project.bookymyshow.dtos.CreateShowRequest;
import com.project.bookymyshow.models.Movie;
import com.project.bookymyshow.models.Show;
import com.project.bookymyshow.models.ShowSeat;
import com.project.bookymyshow.repositories.ShowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class ShowService
{


    private ShowRepository showRepository;

    private MovieService movieService;

    public Show createShow(CreateShowRequest createShowRequest)
    {

        // Task 1 get movie by id by calling MovieService
        Movie movie=movieService.searchMovieById(createShowRequest.getMovieId());

        System.out.println("MOVIE GOT HERE IS "+movie);

        System.out.println(" DURATION RECEIVED "+createShowRequest.getDuration());
            Show show=Show.builder()
                    .startTime(createShowRequest.getStartTime())
                    .duration(createShowRequest.getDuration())
                    .movie(movie)
                    .showSeats(Collections.emptyList())
                    .build();

            Show savedShow=showRepository.save(show);


        // Task 2
        // get the seats in the hall using hallid
        // create show seat using saved show
        //save the show again

        List<ShowSeat> seats=Collections.emptyList();

        return showRepository.save(savedShow.toBuilder().showSeats(seats).build());

    }

    public Show getShow(Long id)
    {
        System.out.println("SHOW  ID RECEIVED IN SERVICE IS  " + id);

        return  showRepository
                .findById(id).
                orElseThrow(() -> new NoSuchElementException("NO ID FOUND "+id));
    }
}
