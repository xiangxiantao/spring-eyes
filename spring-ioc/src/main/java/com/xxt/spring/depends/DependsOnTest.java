package com.xxt.spring.depends;

import com.xxt.spring.depends.beans.FirstBean;
import com.xxt.spring.depends.beans.LastBean;
import com.xxt.spring.ioc.IoCTest;
import org.springframework.context.ApplicationContext;

/**
 * @description: com.xxt.spring.depends
 * @author: haytt.xiang
 * @date: 2020-09-15 21:15
 **/
public class DependsOnTest {

    private static ApplicationContext xmlApplicationContext = IoCTest.createXmlApplicationContext("dependsOnApplicationContext.xml");

    public static void dependsOnBean(){
        xmlApplicationContext.getBean("firstBean", FirstBean.class);
        xmlApplicationContext.getBean("lastBean", LastBean.class);
    }

    public static void main(String[] args) {
        dependsOnBean();
    }

}
