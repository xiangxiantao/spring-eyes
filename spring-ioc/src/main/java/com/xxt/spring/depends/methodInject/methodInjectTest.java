package com.xxt.spring.depends.methodInject;

import com.xxt.spring.ioc.IoCTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: com.xxt.spring.depends.methodInject
 * @author: haytt.xiang
 * @date: 2020-09-15 21:47
 **/
public class methodInjectTest {

    public static void main(String[] args) {
        methodInject();
    }

    /**
     * 在单例bean SingletonBean 不断调用getPri方法创建原型bean，观察创建出来的原型bean是不是新建的
     */
    public static void methodInject(){
        ApplicationContext xmlApplicationContext = IoCTest.createXmlApplicationContext("methodInjectApplicationContext.xml");
        AbsSingletonBean bean = xmlApplicationContext.getBean(AbsSingletonBean.class);
        System.out.println(bean.getPri());
        System.out.println(bean.getPri());
        System.out.println(bean.getPri());
        System.out.println(bean.getPri());


    }


    /**
     * 用getType查看abs类真实的类型
     */
    public static void getAbsRealType(){
        ApplicationContext xmlApplicationContext = IoCTest.createXmlApplicationContext("methodInjectApplicationContext.xml");
        AbsSingletonBean bean = xmlApplicationContext.getBean(AbsSingletonBean.class);
        ClassPathXmlApplicationContext xmlApplicationContext1 = (ClassPathXmlApplicationContext) xmlApplicationContext;
        Class<?> singletonBean = xmlApplicationContext1.getType("singletonBean");
        System.out.println(singletonBean.getName());
    }

}
