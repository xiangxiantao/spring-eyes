package com.xxt.spring.abs;

import com.xxt.spring.abs.beans.ExtBean;
import com.xxt.spring.abs.configuration.AbsBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 1.抽象类中属性的自动注入
 * 2.RootBeanDefinition和ChildBeanDefinition
 */
public class AbsTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AbsBeanConfig.class);
        ExtBean bean = annotationConfigApplicationContext.getBean(ExtBean.class);
        bean.printName();

    }
}
