package com.xxt.spring.extend.config;

import com.xxt.spring.extend.component.MyBeanFactoryPostProcessor;
import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.xxt.spring.extend"})
public class PostConfiguration {

    @Bean
    MyBeanFactoryPostProcessor myBeanFactoryPostProcessor(){
        return new MyBeanFactoryPostProcessor();
    }

    @Bean
    SimpleBean simpleBean(){
        SimpleBean simpleBean = new SimpleBean("xxt", 19);
        return simpleBean;
    }
}
