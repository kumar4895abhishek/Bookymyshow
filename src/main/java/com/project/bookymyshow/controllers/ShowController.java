package com.project.bookymyshow.controllers;

import com.project.bookymyshow.dtos.CreateShowRequest;
import com.project.bookymyshow.models.Show;
import com.project.bookymyshow.services.ShowService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
//@RequestMapping("/api/v1")
public class ShowController
{

    private ShowService showService;

    //REAP API

    @GetMapping("show/{id}")
    private Show readShow(@PathVariable Long id)
    {
        return showService.getShow(id);
    }

    //CREATE API
    @PostMapping("/show")
    private Show  createShow(@RequestBody CreateShowRequest createShowRequest)
    {


        return showService.createShow(createShowRequest);

    }
}
