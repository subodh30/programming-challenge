package com.machado_lab.application_layer.controllers;

import com.machado_lab.application_layer.models.Movement;
import com.machado_lab.application_layer.services.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MovementController {
    private final MovementService movementService;

    public MovementController(MovementService movementService) {
        this.movementService = movementService;
    }

    @GetMapping("/movements")
    public List<Movement> getAllMovements() {
        return movementService.getAllMovements();
    }
}
