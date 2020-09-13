package com.xxt.spring.ioc;

public class AnoBean {

    private String addr;

    private String move;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "AnoBean{" +
                "addr='" + addr + '\'' +
                ", move='" + move + '\'' +
                '}';
    }
}
