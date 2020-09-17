package com.xxt.spring.lifecycle.configuration;

import com.xxt.spring.lifecycle.beans.AwareBean;
import com.xxt.spring.lifecycle.beans.BeanHasLifecycle;
import com.xxt.spring.lifecycle.beans.SmartLifecycleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfig {

    @Bean
    public BeanHasLifecycle beanHasLifecycle(){
        return new BeanHasLifecycle();
    }

    @Bean
    public SmartLifecycleBean smartLifecycleBean(){
        return new SmartLifecycleBean();
    }

    @Bean
    public AwareBean awareBean(){
        return new AwareBean();
    }

}
