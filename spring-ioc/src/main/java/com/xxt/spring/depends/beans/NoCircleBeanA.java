package com.xxt.spring.depends.beans;

/**
 * @description: com.xxt.spring.ioc.bean
 * @author: haytt.xiang
 * @date: 2020-09-14 19:18
 **/
public class NoCircleBeanA {

    private NoCircleBeanB noCircleBeanB;

    public NoCircleBeanB getNoCircleBeanB() {
        return noCircleBeanB;
    }

    public void setNoCircleBeanB(NoCircleBeanB noCircleBeanB) {
        this.noCircleBeanB = noCircleBeanB;
    }

}
