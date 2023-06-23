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
        return getAll("SELECT m.*, o.name AS new_originname, o.address AS new_originaddress, o.city AS new_origincity, o.state AS new_originstate, o.postcode AS new_originpostalcode, o.latitude AS origin_lat, o.longitude AS origin_lon," +
                "       d.name AS new_destinationname, d.address AS new_destinationaddress, d.city AS new_destinationcity,  d.state AS new_destinationstate, d.postcode AS new_destinationpostalcode, d.latitude AS destination_lat, d.longitude AS destination_lon " +
                "FROM Movement m " +
                "JOIN Location o ON m.origin_premId = o.premId " +
                "JOIN Location d ON m.destination_premId = d.premId ", Movement.class);
    }
}
