package com.example.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.example.demo.reflect.Student");
            Field f = clazz.getField("name");
            Field k = clazz.getDeclaredField("id");
            //获取公有地构造方法
//            Constructor<?>[] constructorsArray = clazz.getConstructors();
//            System.out.println(constructorsArray==null);
//            if(!Objects.equals(constructorsArray,null)&&constructorsArray.length!=0){
//                for(Constructor m:constructorsArray){
//                    System.out.println(m);
//                }
//            }else{
//                System.out.println("无法获取");
//            }
//




//            Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
//            for (Constructor n:declaredConstructors){
//                System.out.println(n);
//            }

            Student stu = new Student();

            //获取对象
            Object obj = clazz.getDeclaredConstructor().newInstance();
//            System.out.println(clazz.isInstance(stu));
//            f.set(obj,"二狗");
//            Student stu = (Student) obj;
//            System.out.println(stu.getName());



//            k.setAccessible(true);
//            k.set(obj,111);
//            Student stu2 = (Student)obj;
//            System.out.println(stu2.getId());

//            Method m = clazz.getMethod("show1");
//            m.invoke(obj);
            Method show2 = clazz.getMethod("show2", String.class);
            show2.invoke(obj,"goudan");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
