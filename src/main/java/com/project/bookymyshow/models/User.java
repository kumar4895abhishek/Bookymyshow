package com.project.bookymyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_table")
public class User extends BaseModel
{
	
	private String email;

	private String name;

	private String password;

}
