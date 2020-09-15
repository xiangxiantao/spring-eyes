package com.xxt.spring.bean;

import com.xxt.spring.ioc.IoCTest;
import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 实例化bean相关的测试类
 * @author: haytt.xiang
 * @date: 2020-09-15 20:13
 **/
public class BeanInstanceTest {

    private static ApplicationContext xmlApplicationContext = IoCTest.createXmlApplicationContext("instanceApplicationContext.xml");

    public static void main(String[] args) {
        //instanceBeanByConstructor();
        //instanceBeanByStaticFactory();
        //instanceBeanByFactory();
        runTimeGetBeanType();
    }

    /**
     * 通过构造器实例化bean
     */
    public static void instanceBeanByConstructor(){
        SimpleBean simpleBean = xmlApplicationContext.getBean("simpleBean", SimpleBean.class);
        System.out.println(simpleBean);
    }

    /**
     * 通过静态工厂方法实例化bean
     */
    public static void instanceBeanByStaticFactory(){
        SimpleBean simpleBean2 = xmlApplicationContext.getBean("simpleBean2", SimpleBean.class);
        System.out.println(simpleBean2);
    }

    /**
     * 通过非静态工厂方法实例化bean
     */
    public static void instanceBeanByFactory(){
        SimpleBean simpleBean3 = xmlApplicationContext.getBean("simpleBean3", SimpleBean.class);
        System.out.println(simpleBean3);
    }

    /**
     * 运行时获取bean实际类型
     * TODO: 2020/9/15 特殊情况的测试 1.factoryBean 2.aop代理
     */
    public static void runTimeGetBeanType(){
        ClassPathXmlApplicationContext xmlApplicationContext = (ClassPathXmlApplicationContext) BeanInstanceTest.xmlApplicationContext;
        ConfigurableListableBeanFactory beanFactory = xmlApplicationContext.getBeanFactory();
        Class<?> type = beanFactory.getType("simpleBean");
        System.out.println(type.getName());
        Class<?> type2 = beanFactory.getType("simpleBean2");
        System.out.println(type2.getName());
        Class<?> type3 = beanFactory.getType("simpleBean3");
        System.out.println(type3.getName());
    }

}
