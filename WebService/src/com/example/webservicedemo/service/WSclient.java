package com.example.webservicedemo.service;

public class WSclient {

    public static void main(String[] args) {

        DemoServiceImplService factory = new DemoServiceImplService();
        DemoService ds = factory.getDemoServicePort();
        String result = ds.sayName("cc");
        System.out.println("调用结果是"+result);

    }
}
