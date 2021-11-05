package com.xxt.task;

import com.xxt.task.config.TaskConfiguration;
import com.xxt.task.config.TaskCustomConfiguration;
import com.xxt.task.service.CallerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiantao.xiang
 * @date 2021-11-02 16:41
 **/
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskCustomConfiguration.class);
        //final PrintService printService = applicationContext.getBean(PrintService.class);
        //printService.print();
        final CallerService callerService = applicationContext.getBean(CallerService.class);
        callerService.callJob();
        //这个方法不会使用内部线程池，因为@Async是通过AOP实现的，但是这个方法里面的类的内部方法调用，会导致AOP实失效
        //callerService.callPrint();
    }
}