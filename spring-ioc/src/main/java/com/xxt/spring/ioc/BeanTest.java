package com.xxt.spring.ioc;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class BeanTest {
    public static void main(String[] args) {

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
        AnoBean bean = annotationContext.getBean(AnoBean.class);
        System.out.println(bean);

    }
}
