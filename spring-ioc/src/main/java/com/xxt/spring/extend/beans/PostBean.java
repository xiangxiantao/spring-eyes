package com.xxt.spring.extend.beans;

import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @description: com.xxt.spring.extend.beans
 * @author: haytt.xiang
 * @date: 2020-09-18 22:13
 **/
@Component
@Order(value = 1)//value越小越先执行，默认最后执行
public class PostBean implements BeanPostProcessor  {

    /**
     * 这个方法在bean实例化之后，执行初始化回调方法之前执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "before init");
        return bean;
    }

    /**
     * 这个方法在bean执行完初始化回调之后执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "after init");
        if (bean instanceof SimpleBean){
            return new SimpleBean("other man", 110);
        }
        return bean;
    }
}
