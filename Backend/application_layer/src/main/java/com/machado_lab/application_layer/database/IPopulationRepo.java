package com.machado_lab.application_layer.database;

import com.machado_lab.application_layer.models.Population;

import java.util.List;

public interface IPopulationRepo {
    List<Population> getAllPopulations();
}
