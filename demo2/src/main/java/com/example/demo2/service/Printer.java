package com.example.demo2.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class Printer {

    Adder myClass;

    @PostConstruct
    public void printSum(){
        log.info("Sum "+myClass.sum());
    }
}
