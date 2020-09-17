package com.xxt.spring.abs.beans;

import org.springframework.stereotype.Component;

@Component
public class ExtBean extends AbsBean {

    public void printName(){
        System.out.println(simpleBean.getName());
    }
}
