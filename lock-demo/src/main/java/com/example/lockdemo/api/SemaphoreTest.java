package com.example.lockdemo.api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {



    public static void main(String[] args) {
        //线程池
        ExecutorService exec = Executors.newCachedThreadPool();
        //只有5个线程同时访问
        final Semaphore semp = new Semaphore(5);
        //模拟10个客户端访问
        for (int index=0;index<20;index++){
            final int Num = index;
            Runnable run = new Runnable() {
                @Override
                public void run() {
                    try {
                        //获取许可
                        semp.acquire();
                        System.out.println("Accessing"+Num);
                        //模拟实际逻辑业务
                        Thread.sleep((long) 1000);
                        //访问完后释放
                        semp.release();
                        System.out.println("释放资源"+Num);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
            exec.execute(run);
        }
        exec.shutdown();
    }
}
