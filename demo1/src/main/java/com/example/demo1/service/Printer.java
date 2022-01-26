package com.example.demo1.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class Printer {

    @Autowired
    Adder myClass;

    @PostConstruct
    public void printSum(){
        log.info("Sum "+myClass.sum());
    }
}
