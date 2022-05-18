package com.dnsml.thread;

import java.util.concurrent.Callable;

/**
 * @Author wzj
 * @Date 2022/5/16 17:44
 * @Version 1.0
 */
public class CallableTask implements Callable<String> {
    @Override
    public String call() throws Exception {

        System.out.println("callable task");
        return "hello world";

    }


}
