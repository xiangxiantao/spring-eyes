package com.xxt.spring.enviroment;

import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.PropertySource;

import java.util.Iterator;

public class EnviromentTest {

    public static void main(String[] args) {
        //testProfile();
        testEnvironment();
    }

    public static void testProfile(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("pro");
        context.register(EnviromentConfig.class);
        context.refresh();
        SimpleBean bean = context.getBean(SimpleBean.class);
        System.out.println(bean.getName());
    }

    /**
     * environment中保存了所有的properties以及profiles
     */
    public static void testEnvironment(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(EnviromentConfig.class);
        context.refresh();
        boolean b = context.getEnvironment().containsProperty("catalog.name");
        System.out.println(b);
        Iterator<PropertySource<?>> iterator = context.getEnvironment().getPropertySources().iterator();
        while (iterator.hasNext()){
            PropertySource<?> next = iterator.next();
            System.out.println("---" + next.getName()+ "======" +next.getSource() + "---");
        }
    }

}
