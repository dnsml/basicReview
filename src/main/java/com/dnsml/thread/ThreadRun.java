package com.dnsml.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author wzj
 * @Date 2022/5/16 17:45
 * @Version 1.0
 */
public class ThreadRun {


    public static void main(String[] args) throws Exception {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 41, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), new ThreadPoolExecutor.DiscardOldestPolicy());



        threadPoolExecutor.submit(new RunableTask());
        threadPoolExecutor.submit(new RunableTask());
        threadPoolExecutor.submit(new RunableTask());
        threadPoolExecutor.submit(new RunableTask());
        threadPoolExecutor.submit(new RunableTask());
        threadPoolExecutor.submit(new RunableTask());
        threadPoolExecutor.submit(new RunableTask());
        threadPoolExecutor.submit(new RunableTask());

//        excute()只能用与runnable实现
        threadPoolExecutor.execute(new RunableTask());

//        submit()runnable 和callable都可以
        threadPoolExecutor.submit(new CallableTask());
        threadPoolExecutor.submit(new RunableTask());

//        threadPoolExecutor.execute(new RunableTask());
//        threadPoolExecutor.execute(new RunableTask());
//        threadPoolExecutor.execute(new RunableTask());
//        threadPoolExecutor.execute(new RunableTask());
//        threadPoolExecutor.execute(new RunableTask());
//        threadPoolExecutor.execute(new RunableTask());


    }
}
