package com.machado_lab.application_layer.controllers;

import com.machado_lab.application_layer.models.Population;
import com.machado_lab.application_layer.services.PopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PopulationController {
    private final PopulationService populationService;

    public PopulationController(PopulationService populationService) {
        this.populationService = populationService;
    }

    @GetMapping("/populations")
    public List<Population> getAllPopulations() {
        return populationService.getAllPopulations();
    }
}
