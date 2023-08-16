package com.project.bookymyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user_table")
@EntityListeners(AuditingEntityListener.class)
public class User extends BaseModel
{
	
	private String email;

	private String name;

	private String password;

	public User(String name,String email,String password) {
		this.name=name;
		this.email=email;
		this.password=password;
	}
}
