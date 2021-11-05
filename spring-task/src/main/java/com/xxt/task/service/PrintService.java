package com.xxt.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

/**
 * @author xiantao.xiang
 * @date 2021-11-02 16:43
 **/
@Service
public class PrintService {

    @Autowired
    private TaskExecutor taskExecutor;

    public void print() {
        for (int i = 0; i < 10; i++) {
            taskExecutor.execute(() -> {
                System.out.println(Thread.currentThread() + "writing...");
            });
        }
    }
}
