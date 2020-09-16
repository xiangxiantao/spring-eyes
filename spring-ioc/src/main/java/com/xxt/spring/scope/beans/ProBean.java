package com.xxt.spring.scope.beans;

public class ProBean {

    private Long timeMilis;

    public ProBean(){
        this.timeMilis = System.currentTimeMillis();
    }

    public void printTime() {
        System.out.println("timeMils:" + timeMilis);
    }
}
