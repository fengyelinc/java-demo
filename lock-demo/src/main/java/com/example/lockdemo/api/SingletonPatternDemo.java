package com.example.lockdemo.api;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //获取唯一可用对象
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }

}
