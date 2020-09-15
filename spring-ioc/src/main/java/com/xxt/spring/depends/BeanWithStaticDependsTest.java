package com.xxt.spring.depends;

import com.xxt.spring.depends.beans.BeanWithStaticDepends;
import com.xxt.spring.ioc.beans.SimpleBean;
import com.xxt.spring.depends.configuration.StaticDependsConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: com.xxt.spring.ioc
 * @author: haytt.xiang
 * @date: 2020-09-14 20:25
 **/
public class BeanWithStaticDependsTest {

    /**
     * java类配置元信息模式注入bean静态依赖
     */
    public static void beanWithStaticDepends(){
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(StaticDependsConfiguration.class);
        BeanWithStaticDepends bean = configApplicationContext.getBean(BeanWithStaticDepends.class);
        SimpleBean bean1 = configApplicationContext.getBean(SimpleBean.class);
        System.out.println(bean.getSimpleBean()==bean1);
    }

    /**
     * xml配置元信息模式注入bean静态依赖
     */
    public static void beanWithStaticDependsXml(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("staticDependsApplicationContext.xml");
        BeanWithStaticDepends bean = applicationContext.getBean(BeanWithStaticDepends.class);
        SimpleBean bean1 = applicationContext.getBean(SimpleBean.class);
        System.out.println(bean.getSimpleBean()==bean1);
    }

    public static void main(String[] args) {
        //beanWithStaticDepends();
        beanWithStaticDependsXml();
    }

}
