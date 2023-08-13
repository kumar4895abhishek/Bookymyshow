package com.project.bookymyshow.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Theatre extends BaseModel
{
	
	private String address;

	private String name;

	@OneToMany
	private List<Hall> halls=new ArrayList<>();

	@OneToMany
	private List<Show>  shows=new ArrayList<>();

}
