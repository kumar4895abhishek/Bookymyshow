package models;

import jakarta.persistence.Entity;

@Entity
public class User extends BaseModel
{
	
	private String email;
	
	private String name;

}
