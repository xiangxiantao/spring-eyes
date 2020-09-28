package com.xxt.spring.data.entity;

import com.xxt.spring.data.enu.Sexual;

/**
 * @description: com.xxt.spring.data.entity
 * @author: haytt.xiang
 * @date: 2020-09-28 15:26
 **/
public class Person {

    private String name;

    private int age;

    private Sexual sexual;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sexual getSexual() {
        return sexual;
    }

    public void setSexual(Sexual sexual) {
        this.sexual = sexual;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sexual=" + sexual +
                '}';
    }
}
