package com.xxt.spring.beanWarpper;

import com.xxt.spring.beanWarpper.beans.Company;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyEditorTest {
    public static void main(String[] args) {
        testPropertyEditor();
    }
    public static void testPropertyEditor(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Company bean = context.getBean(Company.class);
        System.out.println(bean);
    }

}
