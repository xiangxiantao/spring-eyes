package com.xxt.spring.enviroment;

import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class EnviromentConfig {

    @Bean
    @Profile("dev")
    public SimpleBean simpleBean1(){
        return new SimpleBean("dev", 10);
    }

    @Bean
    @Profile("pro")
    public SimpleBean simpleBean2(){
        return new SimpleBean("pro", 12);
    }

}
