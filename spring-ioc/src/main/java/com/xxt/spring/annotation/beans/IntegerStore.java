package com.xxt.spring.annotation.beans;

import org.springframework.stereotype.Component;

@Component
public class IntegerStore implements Store<Integer> {
    @Override
    public String call() {
        return this.toString();
    }
}
