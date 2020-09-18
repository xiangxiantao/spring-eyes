package com.xxt.spring.depends.methodInject;

/**
 * @description: com.xxt.spring.depends.methodInject
 * @author: haytt.xiang
 * @date: 2020-09-16 16:30
 **/
public class PriorityBean {

    private String pri;

    public PriorityBean(String pri) {
        this.pri = pri;
    }

    public PriorityBean() {
    }

    public String getPri() {
        return pri;
    }

    public void setPri(String pri) {
        this.pri = pri;
    }

}
