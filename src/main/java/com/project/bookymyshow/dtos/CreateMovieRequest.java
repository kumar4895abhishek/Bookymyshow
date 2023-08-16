package com.project.bookymyshow.dtos;


import com.project.bookymyshow.enums.Language;
import com.project.bookymyshow.enums.MovieFeatures;
import lombok.Data;

import java.util.List;

@Data
public class CreateMovieRequest
{

    private Double rating;

    private String name;

    private List<Language> languages;

    private List<MovieFeatures> movieFeatures;

}
