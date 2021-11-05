package com.xxt.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiantao.xiang
 * @date 2021-11-02 16:58
 **/
@Service
public class CallerService {

    @Autowired
    private PrintServiceUserAsync printServiceUserAsync;

    public void callPrint() {
        printServiceUserAsync.print();
    }

    public void callJob() {
        for (int i = 0; i < 10; i++) {
            printServiceUserAsync.job(i);
        }
    }

}
