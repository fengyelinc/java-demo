package com.example.demo.reflect;

public class Student {
    private int id;
    public String name;

    protected Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("这是含两个参数的构造");
    }

    private Student(int id) {
        this.id = id;
        System.out.println("这是含一个参数的构造");
    }

     Student() {
        System.out.println("这是无参构造");
    }

    public void show1(){
        System.out.println("这是成员方法1");
    }

    public void show2(String name ){
        System.out.println("这是成员方法2");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
