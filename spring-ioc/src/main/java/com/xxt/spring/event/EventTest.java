package com.xxt.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventTest {

    public static void main(String[] args) {
        eventTest();
    }

    public static void eventTest(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext =new AnnotationConfigApplicationContext(MyEnventConfig.class);
        MyEnventPublisher bean = annotationConfigApplicationContext.getBean(MyEnventPublisher.class);
        bean.sendEvent("111");
    }

}
