package com.xxt.spring.annotation.beans;

import org.springframework.stereotype.Component;

@Component
public class StringStore implements Store<String> {
    @Override
    public String call() {
        return this.toString();
    }
}
