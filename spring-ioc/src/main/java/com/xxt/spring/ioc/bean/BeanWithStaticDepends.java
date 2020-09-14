package com.xxt.spring.ioc.bean;

/**
 * @description:
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
