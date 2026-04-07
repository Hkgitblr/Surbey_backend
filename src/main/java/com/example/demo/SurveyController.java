package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/survey")
@CrossOrigin(origins = "*") // allow React
public class SurveyController {

    @Autowired
    SurveyService surveyService;

    @PostMapping
    public Survey saveSurvey(@RequestBody Survey survey) {
        return surveyService.saveSurvey(survey);
    }

    @GetMapping
    public List<Survey> getAll() {
        return surveyService.getAll();
    }
}