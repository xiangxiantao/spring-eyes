package com.xxt.spring.depends.configuration;

import com.xxt.spring.depends.beans.CircleBeanA;
import com.xxt.spring.depends.beans.CircleBeanB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: com.xxt.spring.ioc.configuration
 * @author: haytt.xiang
 * @date: 2020-09-14 20:04
 **/
@Configuration
public class Circleconfiguration {

    @Bean
    public CircleBeanA circleBeanA(){
        return new CircleBeanA(circleBeanB());
    }

    //@Bean
    public CircleBeanB circleBeanB(){
        return new CircleBeanB(null);
    }

}
