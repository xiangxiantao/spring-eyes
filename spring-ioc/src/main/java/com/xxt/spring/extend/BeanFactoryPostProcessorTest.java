package com.xxt.spring.extend;

import com.xxt.spring.extend.component.MyBeanFactoryPostProcessor;
import com.xxt.spring.extend.config.PostConfiguration;
import com.xxt.spring.ioc.beans.SimpleBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryPostProcessorTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(PostConfiguration.class);
        SimpleBean bean = annotationConfigApplicationContext.getBean(SimpleBean.class);
        System.out.println(bean.getName());
    }
}
