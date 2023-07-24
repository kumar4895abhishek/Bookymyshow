package models;

import enums.Language;
import enums.MovieFeatures;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
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
    @Enumerated
    private List<Language> languages=new ArrayList<>();

    @ElementCollection
    @Enumerated
    private List<MovieFeatures> movieFeatures=new ArrayList<>();


}
