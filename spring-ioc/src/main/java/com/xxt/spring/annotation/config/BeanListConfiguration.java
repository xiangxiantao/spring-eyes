package com.xxt.spring.annotation.config;

import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({"com.xxt.spring.annotation"})
public class BeanListConfiguration {


    @Bean
    public SimpleBean simpleBean2(){
        return new SimpleBean("002",02);
    }


    @Bean
    public SimpleBean simpleBean3(){
        return new SimpleBean("003",03);
    }

    @Bean
    public SimpleBean simpleBean1(){
        return new SimpleBean("001",01);
    }



}
