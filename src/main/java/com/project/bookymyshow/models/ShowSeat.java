package com.project.bookymyshow.models;

import com.project.bookymyshow.enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class ShowSeat extends BaseModel
{

    private Double price;

    @Enumerated(EnumType.STRING)
    private SeatStatus status;

    @ManyToOne
    private Seat seat;
}
