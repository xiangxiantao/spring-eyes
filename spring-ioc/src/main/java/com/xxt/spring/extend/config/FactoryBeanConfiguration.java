package com.xxt.spring.extend.config;

import com.xxt.spring.extend.beans.SimpleBeanFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfiguration {

    /**
     * 直接实例化SimpleBeanFactoryBean，便可以在容器中获取其getObject方法返回的实例bean
     * @return
     */
    @Bean
    public SimpleBeanFactoryBean simpleBeanFactoryBean(){
        return new SimpleBeanFactoryBean();
    }

}
