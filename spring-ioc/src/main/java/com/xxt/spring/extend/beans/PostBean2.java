package com.xxt.spring.extend.beans;

import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @description: com.xxt.spring.extend.beans
 * @author: haytt.xiang
 * @date: 2020-09-18 22:13
 **/
@Component
@Order(value = 2)
public class PostBean2 implements BeanPostProcessor  {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "before init2");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "after init2");
        if (bean instanceof SimpleBean){
            return new SimpleBean("other man", 110);
        }
        return bean;
    }
}
