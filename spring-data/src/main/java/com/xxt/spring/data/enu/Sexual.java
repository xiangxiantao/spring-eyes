package com.xxt.spring.data.enu;

import java.util.Arrays;

/**
 * @description: com.xxt.spring.data.enu
 * @author: haytt.xiang
 * @date: 2020-09-28 15:27
 **/
public enum Sexual {
    /**
     * 男
     */
    MAN(1,"man"),

    /**
     * 女
     */
    WOMEN(2, "women");

    private int code;
    private String des;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    Sexual(int code, String des) {
        this.code = code;
        this.des = des;
    }

    public static Sexual getByCode(int code){
        return Arrays.stream(Sexual.values())
                .filter(sexual -> code == sexual.getCode())
                .findAny().orElse(null);
    }
}
