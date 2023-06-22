package com.machado_lab.application_layer.database;

import com.machado_lab.application_layer.models.Population;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PopulationRepository extends GenericDAO implements IPopulationRepo{
    public PopulationRepository(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public List<Population> getAllPopulations() {
        return getAll("SELECT * FROM population", Population.class);
    }
}
