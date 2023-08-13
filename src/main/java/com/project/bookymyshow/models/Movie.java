package com.project.bookymyshow.models;

import com.project.bookymyshow.enums.Language;
import com.project.bookymyshow.enums.MovieFeatures;
import com.project.bookymyshow.enums.PaymentMode;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Movie extends BaseModel
{
    private String name;

    private Double rating;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Language> languages=new ArrayList<>();

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeatures> movieFeatures=new ArrayList<>();


}
