package com.project.bookymyshow.models;

import jakarta.persistence.*;
import lombok.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name="show_name")
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Show extends BaseModel
{
    @ManyToOne
    private Movie movie;

    private Date startTime;

    private Integer duration;

    @ManyToOne
    private Theatre theatre;

    @ManyToOne
    private Hall hall;

    @OneToMany
    private List<ShowSeat> showSeats=new ArrayList<>();

}
