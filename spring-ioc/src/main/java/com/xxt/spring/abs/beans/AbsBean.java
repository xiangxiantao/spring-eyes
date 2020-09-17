package com.xxt.spring.abs.beans;

import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbsBean {

    @Autowired
    protected SimpleBean simpleBean;

}
