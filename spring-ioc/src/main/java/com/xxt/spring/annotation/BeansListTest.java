package com.xxt.spring.annotation;

import com.xxt.spring.annotation.beans.NeedListBean;
import com.xxt.spring.annotation.config.BeanListConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeansListTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanListConfiguration.class);
        annotationConfigApplicationContext.getBean(NeedListBean.class).list();
    }
}
