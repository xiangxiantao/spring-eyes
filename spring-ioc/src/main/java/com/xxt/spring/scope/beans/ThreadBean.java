package com.xxt.spring.scope.beans;

public class ThreadBean {

    private static int instanceNum = 0;

    private Long timeMilis;

    public ThreadBean(){
        this.timeMilis = System.currentTimeMillis();
    }

    public void printTime() {
        System.out.println("timeMils:" + timeMilis + ++instanceNum);
    }
}
