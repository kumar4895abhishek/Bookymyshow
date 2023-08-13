package com.project.bookymyshow.models;

import java.util.ArrayList;
import java.util.List;

import com.project.bookymyshow.enums.PaymentMode;
import com.project.bookymyshow.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="city")
public class City extends BaseModel
{

	private String name;
	
	@OneToMany
	List<Theatre> theaters =new ArrayList<>();


}
