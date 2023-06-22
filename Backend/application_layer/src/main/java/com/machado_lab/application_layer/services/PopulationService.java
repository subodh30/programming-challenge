package com.machado_lab.application_layer.services;

import com.machado_lab.application_layer.database.PopulationRepository;
import com.machado_lab.application_layer.models.Population;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for handling population-related operations.
 */
@Service
public class PopulationService {

    private final PopulationRepository populationRepository;

    /**
     * Constructs a new PopulationService with the specified PopulationRepository.
     *
     * @param populationRepository the PopulationRepository to be used
     */
    public PopulationService(PopulationRepository populationRepository) {
        this.populationRepository = populationRepository;
    }

    /**
     * Retrieves a list of all populations.
     *
     * @return a list of Population objects representing all populations
     */
    public List<Population> getAllPopulations() {
        return populationRepository.getAllPopulations();
    }
}
