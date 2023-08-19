package com.project.bookymyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Hall extends BaseModel
{
    private Integer hallNumber;

    private String hallName;


    @ManyToOne
    private Theatre theatre;
}
