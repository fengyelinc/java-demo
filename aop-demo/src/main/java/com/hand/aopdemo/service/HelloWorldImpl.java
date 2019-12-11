package com.hand.aopdemo.service;

import com.hand.aopdemo.service.HelloWorld;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldImpl implements HelloWorld {

    @Override
    public void sayHello() {
        System.out.println("-----Hello World-----");
    }
}
