package com.xxt.spring.ioc.bean;

/**
 * @description: com.xxt.spring.ioc.bean
 * @author: haytt.xiang
 * @date: 2020-09-14 19:18
 **/
public class CircleBeanB {

    private CircleBeanA circleBeanA;

    public CircleBeanB(CircleBeanA circleBeanA) {
        this.circleBeanA = circleBeanA;
    }
}
