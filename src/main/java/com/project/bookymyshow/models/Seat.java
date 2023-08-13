package com.project.bookymyshow.models;

import com.project.bookymyshow.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Seat extends  BaseModel
{
    private Integer rowNumber;

    private Integer columnNumber;

    @Enumerated(EnumType.STRING)
    private SeatType type;
}
