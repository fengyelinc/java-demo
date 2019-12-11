package com.hand.aopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AspectConf {


    @Pointcut(value = "execution(* com.hand.aopdemo.service.*.*(..))")
    public void check(){}

    @Before(value = "check()")
    public void doSomething(){
        System.out.println("》》》》》》》》在调用前执行");
    }

    @After("check()")
    public void doAfter(){
        System.out.println("》》》》》》》》在调用后执行");
    }

}
