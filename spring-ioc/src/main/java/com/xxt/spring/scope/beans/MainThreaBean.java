package com.xxt.spring.scope.beans;

public class MainThreaBean {

    private ThreadBean threadBean;

    public ThreadBean getThreadBean() {
        return threadBean;
    }

    public void setThreadBean(ThreadBean threadBean) {
        this.threadBean = threadBean;
    }

    public void printTime(){
        threadBean.printTime();
    }
}
