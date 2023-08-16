package com.project.bookymyshow.models;

import com.project.bookymyshow.enums.Language;
import com.project.bookymyshow.enums.MovieFeatures;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie extends BaseModel
{
    private String name;

    private Double rating;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private List<Language> languages=new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private List<MovieFeatures> movieFeatures=new ArrayList<>();


}
