package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

//    ***************************
//    APPLICATION FAILED TO START
//    ***************************
//
//    Description:
//
//    The dependencies of some of the beans in the application context form a cycle:

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
