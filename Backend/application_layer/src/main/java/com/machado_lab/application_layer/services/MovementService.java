package com.machado_lab.application_layer.services;

import com.machado_lab.application_layer.database.MovementRepository;
import com.machado_lab.application_layer.models.Movement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.List;

@Service
public class MovementService {
    private final MovementRepository movementRepository;

    public MovementService(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    public List<Movement> getAllMovements() {
        return movementRepository.getAllMovements();
    }
}
