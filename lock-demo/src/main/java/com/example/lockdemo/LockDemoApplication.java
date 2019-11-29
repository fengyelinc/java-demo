package com.example.lockdemo;

import com.example.lockdemo.api.Hero;
import com.example.lockdemo.api.HeroISkill;
import com.example.lockdemo.api.Skill_Q;
import com.example.lockdemo.api.Timor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.lockdemo.mapper")
public class LockDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LockDemoApplication.class, args);
    }

}
