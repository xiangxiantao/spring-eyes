package com.xxt.spring.data;

import com.xxt.spring.data.config.DataSourceConfig;
import com.xxt.spring.data.entity.Person;
import com.xxt.spring.data.enu.Sexual;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description: com.xxt.spring.data
 * @author: haytt.xiang
 * @date: 2020-09-28 16:36
 **/
public class JdbcTest {

    public static void main(String[] args) {
        testBatchInsert();
    }

    public static void testQuery() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        List<Person> query = jdbcTemplate.query("select * from person", new RowMapper<Person>() {
            @Override
            public Person mapRow(ResultSet resultSet, int i) throws SQLException {
                Person person = new Person();
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setSexual(Sexual.getByCode(resultSet.getInt("sexual")));
                return person;
            }
        });
        query.forEach(System.out::println);


    }

    public static void testQueryForObject(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        Person person = jdbcTemplate.queryForObject("select * from person limit 1", new RowMapper<Person>() {
            @Override
            public Person mapRow(ResultSet resultSet, int i) throws SQLException {
                Person person = new Person();
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setSexual(Sexual.getByCode(resultSet.getInt("sexual")));
                return person;
            }
        });
        System.out.println(person);
    }

    public static void testBatchInsert(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        List<Person> personList = new ArrayList<>();
        Random random = new Random(100);
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            person.setName("二代机"+ i);
            person.setAge(10);
            person.setSexual(Sexual.getByCode(random.nextInt(2) % 2 + 1));
            personList.add(person);
        }

        jdbcTemplate.batchUpdate("insert into person(name, age, sexual) values (?, ?, ?)", new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Person person = personList.get(i);
                ps.setString(1,person.getName());
                ps.setInt(2,person.getAge());
                ps.setInt(3,person.getSexual().getCode());
            }

            @Override
            public int getBatchSize() {
                return personList.size();
            }
        });
    }

}
