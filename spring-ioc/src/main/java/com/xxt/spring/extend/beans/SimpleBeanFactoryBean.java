package com.xxt.spring.extend.beans;

import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.beans.factory.FactoryBean;

/**
 * 利用factoryBean更加自主的实例化bean
 */
public class SimpleBeanFactoryBean implements FactoryBean<SimpleBean> {
    @Override
    public SimpleBean getObject() throws Exception {
        return new SimpleBean("sb", 10);
    }

    @Override
    public Class<?> getObjectType() {
        return SimpleBean.class;
    }
}
