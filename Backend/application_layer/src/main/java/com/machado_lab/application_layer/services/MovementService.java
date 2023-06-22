package com.machado_lab.application_layer.services;

import com.machado_lab.application_layer.database.MovementRepository;
import com.machado_lab.application_layer.models.Movement;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service class for handling movement-related operations.
 */
@Service
public class MovementService {
    private final MovementRepository movementRepository;

    /**
     * Constructs a new MovementService with the specified MovementRepository.
     *
     * @param movementRepository the MovementRepository to be used
     */
    public MovementService(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    /**
     * Retrieves a list of all movements.
     *
     * @return a list of Movement objects representing all movements
     */
    public List<Movement> getAllMovements() {
        return movementRepository.getAllMovements();
    }
}
