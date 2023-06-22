package com.machado_lab.application_layer.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * Represents the population of animals in a specific premise.
 */
@Data
@JsonSerialize
public class Population {

    /**
     * The ID of the premise associated.
     */
    private String premiseId;

    /**
     * The total number of animals in premise.
     */
    private int totalAnimal;
}
