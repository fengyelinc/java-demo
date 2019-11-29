package com.hand.work;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class TestConfiguration {

//        public TestConfiguration() {
//            System.out.println("TestConfiguration容器启动初始化。。。");
//        }
        @Bean
        public void SayHello(){
            System.out.println("Hello");
        }

}
