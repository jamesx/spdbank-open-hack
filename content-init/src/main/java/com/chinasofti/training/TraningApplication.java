package com.chinasofti.training;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.chinasofti.training.dao")
@SpringBootApplication
public class TraningApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraningApplication.class, args);
    }
}
