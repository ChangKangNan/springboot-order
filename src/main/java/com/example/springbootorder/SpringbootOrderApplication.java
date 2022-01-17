package com.example.springbootorder;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringbootOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOrderApplication.class, args);
    }

}
