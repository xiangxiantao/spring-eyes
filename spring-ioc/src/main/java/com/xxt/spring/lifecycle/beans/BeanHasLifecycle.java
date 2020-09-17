package com.xxt.spring.lifecycle.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanHasLifecycle implements InitializingBean , DisposableBean {

    @PostConstruct
    public void init(){
        System.out.println("BeanHasLifecycle的初始化方法");
    }

    @PreDestroy
    public void destory(){
        System.out.println("BeanHasLifecycle的销毁前回调");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanHasLifecycle的afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanHasLifecycle的destroy");
    }
}
