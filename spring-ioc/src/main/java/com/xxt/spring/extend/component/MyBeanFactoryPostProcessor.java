package com.xxt.spring.extend.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 该组件在beanFactory实例化完成后，实例化其他bean之前触发回调
 * 例：PropertySourcesPlaceholderConfigurer
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor postProcessBeanFactory");

    }
}
