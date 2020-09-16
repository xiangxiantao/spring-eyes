package com.xxt.spring.scope;

import com.xxt.spring.ioc.IoCTest;
import com.xxt.spring.scope.beans.ProBean;
import com.xxt.spring.scope.beans.SinBean;
import com.xxt.spring.scope.config.ScopeConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试在大作用域范围内引用小作用域范围bean
 */
public class DiffrentScopeBeanTest {

    public static void main(String[] args) {
        annotationScope();
    }

    public static void xmlScope() {
        ApplicationContext xmlApplicationContext = IoCTest.createXmlApplicationContext("scopeApplicationContext.xml");
        SinBean sinBean = xmlApplicationContext.getBean(SinBean.class);
        sinBean.printTime();
        sinBean.printTime();
        System.out.println(sinBean.getProBean()==sinBean.getProBean());
    }

    public static void annotationScope() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
        SinBean sinBean = annotationConfigApplicationContext.getBean(SinBean.class);
        sinBean.printTime();
        sinBean.printTime();
        System.out.println(sinBean.getProBean()==sinBean.getProBean());
    }
}
