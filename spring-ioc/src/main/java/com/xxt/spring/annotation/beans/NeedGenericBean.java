package com.xxt.spring.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NeedGenericBean {

    @Autowired
    private Store<String> stringStore;

    @Autowired
    private Store<Integer> integerStore;

    /**
     * 会把所有Store不带泛型，全部装配
     */
    @Autowired
    private List<Store> stores;

    public void cl(){
        System.out.println(stringStore.call());
        System.out.println(integerStore.call());
        stores.forEach(store -> {
            System.out.println(store.call());
        });
    }

}
