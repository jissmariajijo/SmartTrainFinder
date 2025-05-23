package com.trainfinder.controllers;

import com.trainfinder.models.TrainOption;
import com.trainfinder.services.TrainSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TrainSearchController {

    @Autowired
    private TrainSearchService trainSearchService;

    @GetMapping("/search")
    public List<TrainOption> searchTrains(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam String date
    ) {
        return trainSearchService.getTrainOptions(from, to, date);
    }
}
