package com.xxt.spring.ioc;

import com.xxt.spring.ioc.bean.SimpleBean;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * spring IoC容器的几种实例化方式
 */
public class IoCTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext = createXmlApplicationContext();
        SimpleBean simpleBean = applicationContext.getBean(SimpleBean.class);
        System.out.println(simpleBean);
    }

    public static ApplicationContext createXmlApplicationContext(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        return applicationContext;
    }

    public static ApplicationContext createAnnotationContext(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        return applicationContext;
    }

    public static ApplicationContext createGenericApplication(){
        GenericApplicationContext applicationContext = new GenericApplicationContext();
        new XmlBeanDefinitionReader(applicationContext).loadBeanDefinitions("applicationContext.xml");
        //todo ConfigurationClassBeanDefinitionReader 是注解的，但是无法使用，还没找到原因，后续排查
        applicationContext.refresh();
        return applicationContext;
    }


}
