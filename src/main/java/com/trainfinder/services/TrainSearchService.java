package com.trainfinder.services;

import com.trainfinder.models.TrainOption;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainSearchService {
    public List<TrainOption> getTrainOptions(String from, String to, String date) {
        return Arrays.asList(
                new TrainOption("5h 10m", "€39", 0, "08:45", "13:55", "DB/NS"),
                new TrainOption("6h 05m", "€29", 1, "07:00", "13:05", "IC + Sprinter")
        );
    }
} 
