package com.xxt.spring.i18n;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class MessageResourceTest {

    public static void main(String[] args) {
        testMessageResource();
    }


    public static void testMessageResource(){
        MessageSource messageSource = new ClassPathXmlApplicationContext("messageSourceApplicationContext.xml");
        String message = messageSource.getMessage("message", null, "Default", Locale.CHINA);
        String required = messageSource.getMessage("argument.required", new Object[]{"userDao"}, "Required", Locale.ENGLISH);
        System.out.println(message);
        System.out.println(required);

    }
}
