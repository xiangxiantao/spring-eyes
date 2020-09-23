package com.xxt.spring.annotation;

import com.xxt.spring.annotation.beans.BeanWithValue;
import com.xxt.spring.annotation.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValueTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanWithValue bean = context.getBean(BeanWithValue.class);
        System.out.println(bean.getCatalog());
    }
}
