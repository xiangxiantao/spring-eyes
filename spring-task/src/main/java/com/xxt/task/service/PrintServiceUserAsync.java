package com.xxt.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author xiantao.xiang
 * @date 2021-11-02 16:43
 **/
@Service
public class PrintServiceUserAsync {

    @Autowired
    private TaskExecutor taskExecutor;

    public void print() {
        for (int i = 0; i < 10; i++) {
            job(i);
        }
    }

    @Async
    public void job(int i) {
        if (i == 3) {
            throw new IllegalArgumentException("参数=3抛出异常");
        }
        System.out.println(Thread.currentThread() + "writing...");
    }
}
