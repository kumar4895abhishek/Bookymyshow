package com.project.bookymyshow.models;

import com.project.bookymyshow.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="seat")
public class Seat extends  BaseModel
{
    private Integer rNumber;

    private Integer cNumber;

    @Enumerated(EnumType.STRING)
    private SeatType type;
}
