package com.example.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public abstract class AbstractDAO<T, ID> {

    private final DataSource dataSource;
    protected JdbcTemplate jdbcTemplate;


    //sfsf

    public AbstractDAO(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate =  new JdbcTemplate(dataSource);
    }

    public abstract void insert(T entity);
    public abstract void update(T entity);
    public abstract void delete(T entity);
    public abstract T findById(ID id);
    public abstract List<T> getAll();

}
