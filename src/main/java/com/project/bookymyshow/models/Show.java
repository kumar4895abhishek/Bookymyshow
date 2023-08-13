package com.project.bookymyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name="show_name")
public class Show extends BaseModel
{
    @ManyToOne
    private Movie movie;

    private Date StartTime;

    private Integer duration;

    @ManyToOne
    private Theatre theatre;

    @ManyToOne
    private Hall hall;

    @OneToMany
    private List<ShowSeat> showSeats=new ArrayList<>();

}
