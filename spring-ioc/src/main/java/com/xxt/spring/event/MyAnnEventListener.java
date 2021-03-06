package com.xxt.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyAnnEventListener {


    @EventListener
    @Order(2)
    @Async
    public void onApplicationEvent(MySimpleEvent event) {
        System.out.println(Thread.currentThread().getName() + " c开始接收消息");
        System.out.println("c接收到event:" + event.getEventName());
        System.out.println(Thread.currentThread().getName() + " c接收消息完毕");
    }
}
