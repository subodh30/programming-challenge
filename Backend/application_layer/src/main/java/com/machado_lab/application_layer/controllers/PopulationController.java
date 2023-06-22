package com.machado_lab.application_layer.controllers;

import com.machado_lab.application_layer.models.Population;
import com.machado_lab.application_layer.services.PopulationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST API controller for handling population-related requests.
 */
@RestController
@CrossOrigin(origins = "*")
public class PopulationController {
    private final PopulationService populationService;

    /**
     * Constructs a new PopulationController with the specified PopulationService.
     *
     * @param populationService the PopulationService to be used
     */
    public PopulationController(PopulationService populationService) {
        this.populationService = populationService;
    }

    /**
     * Retrieves a list of all populations.
     *
     * @return a list of Population objects representing all populations
     */
    @GetMapping("/populations")
    public List<Population> getAllPopulations() {
        return populationService.getAllPopulations();
    }
}
