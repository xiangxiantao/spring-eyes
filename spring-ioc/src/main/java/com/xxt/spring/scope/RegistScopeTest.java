package com.xxt.spring.scope;

import com.xxt.spring.scope.beans.MainThreaBean;
import com.xxt.spring.scope.beans.ThreadBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.SimpleThreadScope;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 自定义及像向器中注册scope
 */
public class RegistScopeTest {

    /**
     * 硬编码注册scope
     * @param
     */
    public static void first() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("customizeApplicationContext.xml");
        ConfigurableListableBeanFactory beanFactory = classPathXmlApplicationContext.getBeanFactory();
        beanFactory.registerScope("thread", new SimpleThreadScope());
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.execute(() ->{
                ThreadBean bean = classPathXmlApplicationContext.getBean(ThreadBean.class);
                System.out.println(Thread.currentThread().getName());
                bean.printTime();
            });
        }
    }

    /**
     * 在xml文件中注册scope
     */
    public static void second(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("customizeApplicationContext.xml");
        ThreadBean bean = applicationContext.getBean(ThreadBean.class);
        bean.printTime();
        new Thread(()->{applicationContext.getBean(ThreadBean.class).printTime();}).start();
        new Thread(()->{applicationContext.getBean(ThreadBean.class).printTime();}).start();
        new Thread(()->{applicationContext.getBean(ThreadBean.class).printTime();}).start();
    }

    public static void main(String[] args) {
        first();
        //second();
    }
}
