package com.machado_lab.application_layer.database;

import com.machado_lab.application_layer.models.Movement;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Repository class for accessing and managing Movement entities in the database.
 */
@Repository
public class MovementRepository extends GenericDAO implements IMovementRepo {

    /**
     * Constructs a new MovementRepository with the specified JdbcTemplate.
     *
     * @param jdbcTemplate the JdbcTemplate to be used for database operations
     */
    public MovementRepository(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    /**
     * Retrieves a list of all movements.
     *
     * @return a list of Movement objects representing all movements
     */
    @Override
    public List<Movement> getAllMovements() {
        return getAll("SELECT * FROM movement", Movement.class);
    }
}
