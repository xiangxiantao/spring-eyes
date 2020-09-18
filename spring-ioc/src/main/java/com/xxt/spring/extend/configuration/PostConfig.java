package com.xxt.spring.extend.configuration;

import com.xxt.spring.ioc.beans.SimpleBean;
import com.xxt.spring.lifecycle.beans.BeanHasLifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description: com.xxt.spring.extend.configuration
 * @author: haytt.xiang
 * @date: 2020-09-18 22:19
 **/
@Configuration
@ComponentScan(basePackages = {"com.xxt.spring.extend"})
public class PostConfig {

    @Bean
    public SimpleBean simpleBean(){
        return new SimpleBean("xxt", 2);
    }

    @Bean
    public BeanHasLifecycle beanHasLifecycle(){
        return new BeanHasLifecycle();
    }

}
