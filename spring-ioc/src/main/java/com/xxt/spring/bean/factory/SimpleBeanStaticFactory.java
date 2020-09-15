package com.xxt.spring.bean.factory;

import com.xxt.spring.ioc.beans.SimpleBean;

/**
 * @description: SimpleBean的静态工厂
 * @author: haytt.xiang
 * @date: 2020-09-15 20:18
 **/
public class SimpleBeanStaticFactory {

    public static SimpleBean newInstance(String name, Integer age){
        return new SimpleBean(name, age);
    }

}
