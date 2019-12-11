package com.hand.aopdemo.controller;

import com.hand.aopdemo.service.HelloWorld;
import com.hand.aopdemo.service.HelloWorldImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @Autowired
    private HelloWorld helloWorld;

    @GetMapping("/")
    public void sayHello(String name){
      helloWorld.sayHello();
    }


}
