package com.xxt.spring.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class MyEnventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }


    public void sendEvent(String aEvent){
        System.out.println(Thread.currentThread().getName() + "开始发送消息");
        applicationEventPublisher.publishEvent(new MySimpleEvent(this, aEvent));
        System.out.println(Thread.currentThread().getName() + "发送消息完毕");
    }
}
