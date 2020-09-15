package com.xxt.spring.depends;

import com.xxt.spring.depends.beans.CircleBeanA;
import com.xxt.spring.depends.beans.NoCircleBeanA;
import com.xxt.spring.depends.configuration.Circleconfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;

/**
 * @description: 循环依赖测试
 * @author: haytt.xiang
 * @date: 2020-09-14 19:21
 **/
public class CircleDependsTest {

    /**
     * 构造器依赖注入会导致无法解的循环依赖
     */
    public static void constructorCircleDepends(){
        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("circleApplicationContext.xml");
        CircleBeanA beanA = xmlApplicationContext.getBean(CircleBeanA.class);

    }

    /**
     * java类配置模式下的构造器依赖注入导致无法解的循环依赖
     */
    public static void constructorAnnotationCircle(){
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Circleconfiguration.class);
        //CircleBeanA bean = configApplicationContext.getBean(CircleBeanA.class);
    }

    /**
     * setter方法的依赖注入可以解决上述的循环依赖，主要是利用三级缓存机制，研究！
     */
    public static void setterCircleDepends(){
        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("noCircleApplicationContext.xml");
        NoCircleBeanA bean = xmlApplicationContext.getBean(NoCircleBeanA.class);

    }


    public static void main(String[] args) throws UnsupportedEncodingException {
        //constructorCircleDepends();
        //setterCircleDepends();
        //constructorAnnotationCircle();
        System.out.println(URLDecoder.decode("%E5%AD%99%E6%80%9D%E8%A1%A1", "utf-8"));
    }

}
