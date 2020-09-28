package com.xxt.spring.data;

import com.xxt.spring.data.config.DataSourceConfig;
import com.xxt.spring.data.dao.PersonDao;
import com.xxt.spring.data.entity.Person;
import com.xxt.spring.data.enu.Sexual;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: com.xxt.spring.data
 * @author: haytt.xiang
 * @date: 2020-09-28 15:46
 **/
public class PersonDaoTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
        PersonDao personDao = context.getBean(PersonDao.class);
        Person person = new Person();
        person.setName("初代机3");
        person.setAge(4);
        person.setSexual(Sexual.MAN);
        System.out.println(personDao.insert(person));
    }
}
