package com.example.lockdemo.api;

import java.util.concurrent.CountDownLatch;

public class TestSyn  {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        System.out.println("主线程准备完毕，等待其他线程");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2初始化中");
                try {
                    Thread.sleep(3000);
                    System.out.println("t2准备完毕，通知主线程");
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t3初始化中");
                try {
                    Thread.sleep(5000);
                    System.out.println("t3准备完毕，通知主线程");
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
        t3.start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("主线程继续");

    }


}
