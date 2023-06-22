package com.machado_lab.application_layer.database;

import com.machado_lab.application_layer.models.Movement;

import java.util.List;

public interface IMovementRepo {
    List<Movement> getAllMovements();
}
