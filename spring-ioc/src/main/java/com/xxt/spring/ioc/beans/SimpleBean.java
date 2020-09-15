package com.xxt.spring.ioc.beans;

public class SimpleBean {

    private String name;

    private Integer age;

    public SimpleBean(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public SimpleBean() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
