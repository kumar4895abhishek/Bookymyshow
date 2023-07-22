package models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class ShowSeat extends BaseModel {

    private Show show;
}
