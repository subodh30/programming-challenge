package com.machado_lab.application_layer.controllers;

import com.machado_lab.application_layer.models.Movement;
import com.machado_lab.application_layer.services.MovementService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST API controller for handling movement-related requests.
 */
@RestController
@CrossOrigin(origins = "*")
public class MovementController {
    private final MovementService movementService;

    /**
     * Constructs a new MovementController with the specified MovementService.
     *
     * @param movementService the MovementService to be used
     */
    public MovementController(MovementService movementService) {
        this.movementService = movementService;
    }

    /**
     * Retrieves a list of all movements.
     *
     * @return a list of Movement objects representing all movements
     */
    @GetMapping("/movements")
    public List<Movement> getAllMovements() {
        return movementService.getAllMovements();
    }
}
