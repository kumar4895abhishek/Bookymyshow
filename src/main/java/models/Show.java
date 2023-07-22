package models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
public class Show extends BaseModel
{
    @ManyToOne
    private Movie movie;

    private Date StartTime;

    private Integer duration;

    @ManyToOne
    private Theatre theatre;

    @OneToMany(fetch=FetchType.EAGER,mappedBy = "show")
    private List<ShowSeat> showSeats=new ArrayList<>();

}
