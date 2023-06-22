package com.machado_lab.application_layer.database;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

/**
 * Generic Data Access Object (DAO) class for performing database operations.
 */
@Component
public class GenericDAO {
    private final JdbcTemplate jdbcTemplate;

    /**
     * Constructs a new GenericDAO with the specified JdbcTemplate.
     *
     * @param jdbcTemplate the JdbcTemplate to be used for database operations
     */
    public GenericDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Retrieves a list of objects of the specified class using the provided SQL query.
     *
     * @param sqlQuery   the SQL query to execute
     * @param className  the class of the objects to be retrieved
     * @param <T>        the type of the objects to be retrieved
     * @return a list of objects of the specified class
     */
    public <T> List<T> getAll(String sqlQuery, Class<T> className) {
        return jdbcTemplate.query(sqlQuery, BeanPropertyRowMapper.newInstance(className));
    }
}
