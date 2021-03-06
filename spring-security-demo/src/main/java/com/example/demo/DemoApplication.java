package com.example.demo;


import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;



@SpringBootApplication
@EnableSwagger2
//@ComponentScan(value= "com.example.demo.mapper")
@MapperScan(basePackages= "com.example.demo.mapper")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class DemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
