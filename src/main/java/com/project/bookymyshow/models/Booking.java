package com.project.bookymyshow.models;

import com.project.bookymyshow.enums.PaymentMode;
import com.project.bookymyshow.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Booking extends  BaseModel
{

    private String reference;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private PaymentMode providerType;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

}
