package com.kaiqing.numberingsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.kaiqing.numberingsystem")
@MapperScan("com.kaiqing.numberingsystem.mapper")
public class NumberingsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(NumberingsystemApplication.class, args);
    }

}
