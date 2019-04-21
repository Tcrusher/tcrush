package com.tcrush;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tcrush.dao")
@SpringBootApplication
public class TcrushApplication {

    public static void main(String[] args) {

        SpringApplication.run(TcrushApplication.class, args);
    }

}
