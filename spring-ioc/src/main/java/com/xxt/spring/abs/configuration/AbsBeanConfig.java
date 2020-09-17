package com.xxt.spring.abs.configuration;

import com.xxt.spring.abs.beans.ExtBean;
import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.xxt.spring.abs"})
public class AbsBeanConfig {

    @Bean
    public SimpleBean simpleBean(){
        SimpleBean simpleBean = new SimpleBean("xxt",19);
        return simpleBean;
    }

}
