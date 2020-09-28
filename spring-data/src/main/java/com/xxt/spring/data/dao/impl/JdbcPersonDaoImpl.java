package com.xxt.spring.data.dao.impl;

import com.xxt.spring.data.dao.PersonDao;
import com.xxt.spring.data.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: jdbcTemplate实现的personDao
 * @author: haytt.xiang
 * @date: 2020-09-28 15:38
 **/
@Repository
public class JdbcPersonDaoImpl implements PersonDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Person person) {
        return jdbcTemplate.update("insert into person values (?,?,?,?)",null,person.getName(),person.getAge(),person.getSexual().getCode());
    }

    @Override
    public int batchInsert(List<Person> persons) {
        return 0;
    }

    @Override
    public int delete(long id) {
        return 0;
    }

    @Override
    public int update(Person person) {
        return 0;
    }

    @Override
    public Person selectbyId(long id) {
        return null;
    }

    @Override
    public List<Person> selectByExample(Person person) {
        return null;
    }
}
