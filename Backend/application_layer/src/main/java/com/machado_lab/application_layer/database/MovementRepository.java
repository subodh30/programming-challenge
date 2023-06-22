package com.machado_lab.application_layer.database;

import com.machado_lab.application_layer.models.Movement;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MovementRepository extends GenericDAO implements IMovementRepo {
    public MovementRepository(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public List<Movement> getAllMovements() {
        return getAll("SELECT * FROM movement", Movement.class);
    }
}