package com.project.bookymyshow.models;

import com.project.bookymyshow.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends  BaseModel
{

    @ManyToOne
    private User user;

    @ManyToOne
    private  Show show;

    @ManyToMany
    private List<ShowSeat> seats=new ArrayList<>();


    private Double amount;

    private Date bookedAt;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    @OneToMany
    private List<Payment> payments =new ArrayList<>();

}
