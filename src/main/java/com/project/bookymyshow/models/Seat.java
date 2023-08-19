package com.project.bookymyshow.models;

import com.project.bookymyshow.enums.SeatType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="seat",uniqueConstraints = {@UniqueConstraint(columnNames = {"roNumber", "colNumber"}) })
public class Seat extends  BaseModel
{
    private Long roNumber;

    private Long colNumber;

    @Enumerated(EnumType.STRING)
    private SeatType type;


}
