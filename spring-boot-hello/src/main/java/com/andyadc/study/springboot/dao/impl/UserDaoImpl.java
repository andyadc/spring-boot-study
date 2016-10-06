package com.andyadc.study.springboot.dao.impl;

import com.andyadc.study.springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author andaicheng
 */
@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(String name, Integer age) {
        jdbcTemplate.update("INSERT INTO USER (NAME , AGE) VALUES (?, ?)", name, age);
    }

    @Override
    public void deleteById(Long id) {
        jdbcTemplate.update("DELETE FROM USER WHERE ID = ?", id);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("DELETE FROM USER");
    }
}
