package com.machado_lab.application_layer.database;

import com.machado_lab.application_layer.models.Population;

import java.util.List;

/**
 * Repository interface for accessing and managing Population entities in the database.
 */
public interface IPopulationRepo {

    /**
     * Retrieves a list of all populations.
     *
     * @return a list of Population objects representing all populations
     */
    List<Population> getAllPopulations();
}
