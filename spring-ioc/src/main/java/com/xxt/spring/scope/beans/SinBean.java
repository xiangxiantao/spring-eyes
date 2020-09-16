package com.xxt.spring.scope.beans;

public class SinBean {

    private ProBean proBean;

    public ProBean getProBean() {
        return proBean;
    }

    public void setProBean(ProBean proBean) {
        this.proBean = proBean;
    }

    public void printTime(){
        proBean.printTime();
    }


}
