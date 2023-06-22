package com.machado_lab.application_layer.database;

import com.machado_lab.application_layer.models.Movement;

import java.util.List;

/**
 * Repository interface for accessing and managing Movement entities in the database.
 */
public interface IMovementRepo {

    /**
     * Retrieves a list of all movements.
     *
     * @return a list of Movement objects representing all movements
     */
    List<Movement> getAllMovements();
}
