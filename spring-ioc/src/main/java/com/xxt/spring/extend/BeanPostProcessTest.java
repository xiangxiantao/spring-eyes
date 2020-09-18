package com.xxt.spring.extend;

import com.xxt.spring.extend.configuration.PostConfig;
import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: com.xxt.spring.extend
 * @author: haytt.xiang
 * @date: 2020-09-18 22:13
 **/
public class BeanPostProcessTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(PostConfig.class);
        SimpleBean simpleBean = configApplicationContext.getBean(SimpleBean.class);
        System.out.println(simpleBean.getName());
    }

}
