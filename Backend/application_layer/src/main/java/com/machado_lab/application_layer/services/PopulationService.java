package com.machado_lab.application_layer.services;

import com.machado_lab.application_layer.database.PopulationRepository;
import com.machado_lab.application_layer.models.Population;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopulationService {

    private final PopulationRepository populationRepository;

    public PopulationService(PopulationRepository populationRepository) {
        this.populationRepository = populationRepository;
    }

    public List<Population> getAllPopulations() {
        return populationRepository.getAllPopulations();
    }
}
