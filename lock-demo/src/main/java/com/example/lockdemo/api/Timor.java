package com.example.lockdemo.api;

public class Timor implements Hero {
    public String name;

    public Timor(String name) {
        this.name = name;
    }

    @Override
    public void learnSkill() {
        System.out.println(name+"学习了以上技能");
    }
}
