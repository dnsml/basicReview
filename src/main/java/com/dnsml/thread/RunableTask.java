package com.dnsml.thread;

/**
 * @Author wzj
 * @Date 2022/5/11 19:31
 * @Version 1.0
 */
public class RunableTask implements Runnable{


    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ "hello  ==>" +i);

        }
        try {
            Thread.sleep(200000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
