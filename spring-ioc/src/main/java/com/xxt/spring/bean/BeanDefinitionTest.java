package com.xxt.spring.bean;

import com.xxt.spring.ioc.IoCTest;
import com.xxt.spring.ioc.beans.AnoBean;
import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @decription:  BeanDefinition相关的测试类
 * @author: haytt.xiang
 * @date: 2020/9/15
 * @version:  1.0
*/
public class BeanDefinitionTest {

    /**
     * 通过bean name获取bean
     */
    public static void getBeanByName(){
        ApplicationContext xmlApplicationContext = IoCTest.createXmlApplicationContext("applicationContext.xml");
        SimpleBean simpleBean = (SimpleBean) xmlApplicationContext.getBean("bean1");
        System.out.println(simpleBean);
    }

    /**
     * 在运行时像容器注册自定义的beanDefinition
     */
    public static void customizeInjectBeanDefinition(){
        //构建自定义的BeanDefination
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(AnoBean.class);
        genericBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
        MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
        mutablePropertyValues.add("addr", "四川");
        mutablePropertyValues.add("move", "重庆");
        genericBeanDefinition.setPropertyValues(mutablePropertyValues);

        //获取DefaultListableBeanFactory
        AnnotationConfigApplicationContext annotationContext = (AnnotationConfigApplicationContext) IoCTest.createAnnotationContext();
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) annotationContext.getBeanFactory();

        //利用DefaultListableBeanFactory来注册BeanDefinition
        beanFactory.registerBeanDefinition("zidingyi", genericBeanDefinition);

        //刷新容器,不刷新容器直接获取会报错AnnotationConfigApplicationContext has not been refreshed yet
        annotationContext.refresh();

        //获取自定义的beanDefination
        AnoBean bean = (AnoBean) annotationContext.getBean("zidingyi");
        System.out.println(bean);
    }

    /**
     * 在运行时获取beanDefinition
     */
    public static void getBeanDefinitionOnRuntime(){
        //获取DefaultListableBeanFactory
        AnnotationConfigApplicationContext annotationContext = (AnnotationConfigApplicationContext) IoCTest.createAnnotationContext();
        BeanDefinition zidingyi = annotationContext.getBeanDefinition("zidingyi");
    }

    public static void main(String[] args) {
        //customizeInjectBeanDefinition();
        getBeanByName();
    }
}
