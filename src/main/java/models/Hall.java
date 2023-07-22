package models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Hall extends BaseModel  {

    @ManyToOne
    private Theatre theatre;
}
