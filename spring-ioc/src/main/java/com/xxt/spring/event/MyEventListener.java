package com.xxt.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<MySimpleEvent> {

    @Override
    public void onApplicationEvent(MySimpleEvent event) {
        System.out.println(Thread.currentThread().getName() + " a开始接收消息");
        System.out.println("a接收到event:" + event.getEventName());
        System.out.println(Thread.currentThread().getName() + " a接收消息完毕");
    }
}
