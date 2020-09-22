package com.xxt.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyAnoEventListener implements ApplicationListener<MySimpleEvent> {

    @Override
    public void onApplicationEvent(MySimpleEvent event) {
        System.out.println(Thread.currentThread().getName() + " b开始接收消息");
        System.out.println("b接收到event:" + event.getEventName());
        System.out.println(Thread.currentThread().getName() + " b接收消息完毕");
    }
}
