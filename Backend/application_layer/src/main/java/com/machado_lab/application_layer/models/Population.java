package com.machado_lab.application_layer.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@Data
@JsonSerialize
public class Population {
    private String premiseId;
    private int totalAnimal;
}
