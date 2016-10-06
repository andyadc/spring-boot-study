package com.andyadc.study.springboot.dao;

/**
 * @author andaicheng
 */
public interface UserDao {

    void add(String name, Integer age);

    void deleteById(Long id);

    void deleteAllUsers();
}
