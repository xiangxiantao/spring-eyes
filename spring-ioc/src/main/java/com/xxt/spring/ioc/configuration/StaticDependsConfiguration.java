package com.xxt.spring.ioc.configuration;

import com.xxt.spring.ioc.bean.BeanWithStaticDepends;
import com.xxt.spring.ioc.bean.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: com.xxt.spring.ioc.configuration
 * @author: haytt.xiang
 * @date: 2020-09-14 20:22
 **/
@Configuration
public class StaticDependsConfiguration {

    @Bean
    public SimpleBean simpleBean(){
        SimpleBean simpleBean = new SimpleBean();
        simpleBean.setName("xxt");
        simpleBean.setAge(19);
        return simpleBean;
    }

    @Bean
    public BeanWithStaticDepends beanWithStaticDepends(){
        BeanWithStaticDepends beanWithStaticDepends = new BeanWithStaticDepends();
        beanWithStaticDepends.setHome("home");
        beanWithStaticDepends.setSimpleBean(simpleBean());
        return beanWithStaticDepends;
    }

}
