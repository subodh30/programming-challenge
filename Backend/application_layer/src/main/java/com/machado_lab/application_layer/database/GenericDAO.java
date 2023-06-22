package com.machado_lab.application_layer.database;

import com.machado_lab.application_layer.models.Movement;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

@Component
public class GenericDAO {
    public GenericDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    private final JdbcTemplate jdbcTemplate;

    public <T>  List<T> getAll(String sqlQuery, Class<T> className) {
        return jdbcTemplate.query(sqlQuery,BeanPropertyRowMapper.newInstance(className) );
    }
}
