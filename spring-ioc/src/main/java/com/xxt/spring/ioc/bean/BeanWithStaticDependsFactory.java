package com.xxt.spring.ioc.bean;

/**
 * @description:
 * @author: haytt.xiang
 * @date: 2020-09-14 20:20
 **/
public class BeanWithStaticDependsFactory {

    public static BeanWithStaticDepends newInstance(SimpleBean simpleBean, String home){
        BeanWithStaticDepends beanWithStaticDepends = new BeanWithStaticDepends();
        beanWithStaticDepends.setSimpleBean(simpleBean);
        beanWithStaticDepends.setHome(home);
        return beanWithStaticDepends;
    }

}
