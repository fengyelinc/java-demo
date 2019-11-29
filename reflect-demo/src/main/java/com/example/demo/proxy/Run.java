package com.example.demo.proxy;

import com.example.demo.proxy.impl.Developer;

import java.lang.reflect.Proxy;

public class Run {
    public static void main(String[] args) throws ClassNotFoundException {
        Humen humen=new Developer();

        MyInvocationHandler proxy = new MyInvocationHandler(humen);

        Humen obj = (Humen)proxy.CreatProxyedObj();

        obj.drink();




    }
}
