package com.xxt.spring.data.dao;

import com.xxt.spring.data.entity.Person;

import java.util.List;

/**
 * @description: com.xxt.spring.data.dao
 * @author: haytt.xiang
 * @date: 2020-09-28 15:25
 **/
public interface PersonDao {

    int insert(Person person);

    int batchInsert(List<Person> persons);

    int delete(long id);

    int update(Person person);

    Person selectbyId(long id);

    List<Person> selectByExample(Person person);

}
