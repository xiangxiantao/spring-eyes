package com.xxt.spring.depends.methodInject;

/**
 * @description: com.xxt.spring.depends.methodInject
 * @author: haytt.xiang
 * @date: 2020-09-16 16:29
 **/
public abstract class AbsSingletonBean {

    public void work(){
        PriorityBean pri = getPri();
        System.out.println(pri);
    }

    public abstract PriorityBean getPri();

}
