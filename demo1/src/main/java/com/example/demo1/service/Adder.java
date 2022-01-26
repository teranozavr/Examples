package com.example.demo1.service;

import com.example.demo1.domain.A;
import com.example.demo1.domain.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Adder {
    @Autowired
    private A a;

    @Autowired
    private B b;

    public int sum() {
        return a.getA() + b.getB();
    }
}
