package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

//    Error creating bean with name 'printer': Invocation of init method failed; nested exception is java.lang.StackOverflowError

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
