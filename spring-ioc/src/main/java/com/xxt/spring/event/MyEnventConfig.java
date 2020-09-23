package com.xxt.spring.event;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
@ComponentScan({"com.xxt.spring.event"})
public class MyEnventConfig {
}
