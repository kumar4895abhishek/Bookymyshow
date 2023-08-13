package com.project.bookymyshow.models;


import com.project.bookymyshow.enums.MovieFeatures;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Hall extends BaseModel
{
    private Integer hallNumber;


    @ManyToOne
    private Theatre theatre;
}
