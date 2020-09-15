package com.xxt.spring.depends.beans;

import com.xxt.spring.ioc.beans.SimpleBean;

/**
 * @description: 包含静态依赖的bean
 * @author: haytt.xiang
 * @date: 2020-09-14 20:20
 **/
public class BeanWithStaticDepends {

    public static SimpleBean simpleBean;

    private String home;

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }

    public void setSimpleBean(SimpleBean simpleBean) {
        BeanWithStaticDepends.simpleBean = simpleBean;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
