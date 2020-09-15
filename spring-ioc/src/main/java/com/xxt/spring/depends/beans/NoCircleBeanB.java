package com.xxt.spring.depends.beans;

/**
 * @description: com.xxt.spring.ioc.bean
 * @author: haytt.xiang
 * @date: 2020-09-14 19:18
 **/
public class NoCircleBeanB {

    private NoCircleBeanA noCircleBeanA;

    public NoCircleBeanA getNoCircleBeanA() {
        return noCircleBeanA;
    }

    public void setNoCircleBeanA(NoCircleBeanA noCircleBeanA) {
        this.noCircleBeanA = noCircleBeanA;
    }
}
