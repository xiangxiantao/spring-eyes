package com.xxt.spring.lifecycle;

import com.xxt.spring.lifecycle.beans.AwareBean;
import com.xxt.spring.lifecycle.beans.BeanHasLifecycle;
import com.xxt.spring.lifecycle.configuration.LifecycleConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1.SmartLifecycle
 * 2.BeanWithLifecycle
 * 3.AwareBean
 */
public class LifecycleTest {

    public static void xml() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycleApplicationContext.xml");
        BeanHasLifecycle beanHasLifecycle = applicationContext.getBean(BeanHasLifecycle.class);
        applicationContext.close();
    }

    public static void annotation(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(LifecycleConfig.class);
        annotationConfigApplicationContext.registerShutdownHook();
        BeanHasLifecycle bean = annotationConfigApplicationContext.getBean(BeanHasLifecycle.class);
        annotationConfigApplicationContext.close();
    }

    public static void awareBean(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(LifecycleConfig.class);
        AwareBean bean = annotationConfigApplicationContext.getBean(AwareBean.class);
        bean.printBeanName();
    }

    public static void main(String[] args) {
        //annotation();
        //xml();
        awareBean();
    }
}
