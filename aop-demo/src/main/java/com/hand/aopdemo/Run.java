package com.hand.aopdemo;

import com.hand.aopdemo.controller.HelloController;
import com.hand.aopdemo.service.HelloWorldImpl;

public class Run {
    public static void main(String[] args) {
        HelloController helloController = new HelloController();
        helloController.sayHello("ergou");
    }
}
