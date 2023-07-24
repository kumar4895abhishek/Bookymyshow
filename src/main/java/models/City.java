package models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="city") //not necessary if set entity it wil create with same name city table if change use table
public class City extends BaseModel
{

	private String name;
	
	@OneToMany
	@JoinColumn(name = "city_id")
	List<Theatre> theaters =new ArrayList<>();

}
