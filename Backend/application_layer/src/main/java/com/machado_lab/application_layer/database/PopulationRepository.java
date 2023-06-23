package com.machado_lab.application_layer.database;

import com.machado_lab.application_layer.models.Population;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository class for accessing and managing Population entities in the database.
 */
@Repository
public class PopulationRepository extends GenericDAO implements IPopulationRepo {

    /**
     * Constructs a new PopulationRepository with the specified JdbcTemplate.
     *
     * @param jdbcTemplate the JdbcTemplate to be used for database operations
     */
    public PopulationRepository(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    /**
     * Retrieves a list of all populations.
     *
     * @return a list of Population objects representing all populations
     */
    @Override
    public List<Population> getAllPopulations() {
        return getAll("SELECT * FROM Population", Population.class);
    }
}
