package com.xxt.spring.annotation;

import com.xxt.spring.annotation.beans.NeedGenericBean;
import com.xxt.spring.annotation.config.BeanListConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GenericsTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanListConfiguration.class);
        NeedGenericBean bean = context.getBean(NeedGenericBean.class);
        bean.cl();
    }
}
