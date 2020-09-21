package com.xxt.spring.extend.configuration;

import com.xxt.spring.extend.beans.SimpleBeanFactoryBean;
import com.xxt.spring.extend.config.FactoryBeanConfiguration;
import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfiguration.class);
        SimpleBean bean = annotationConfigApplicationContext.getBean(SimpleBean.class);
        SimpleBeanFactoryBean bean1 = annotationConfigApplicationContext.getBean(SimpleBeanFactoryBean.class);
        System.out.println(bean.getName());
        System.out.println(bean1);
    }
}
