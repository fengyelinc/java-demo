package com.example.demo.proxy.impl;

import com.example.demo.proxy.Humen;

public class Developer implements Humen {
    @Override
    public void eat() {
        System.out.println("吃饱了才有力气干活");
    }

    @Override
    public void drink() {
        System.out.println("吨吨吨~~");
    }

    public void work(){
        System.out.println("加班使我快乐！！！");
    }
}
