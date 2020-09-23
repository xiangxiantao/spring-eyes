package com.xxt.spring.annotation.beans;

import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NeedListBean {

    @Autowired
    private List<SimpleBean> simpleBeans;

    public void list(){
        simpleBeans.forEach(simpleBean -> System.out.println(simpleBean.getName()));
    }

}
