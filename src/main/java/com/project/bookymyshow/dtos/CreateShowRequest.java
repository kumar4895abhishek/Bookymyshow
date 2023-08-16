package com.project.bookymyshow.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class CreateShowRequest
{

    private Long hallId;

    private Long movieId;

    private Integer duration;

    private Date startTime;



}
