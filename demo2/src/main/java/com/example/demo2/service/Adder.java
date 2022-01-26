package com.example.demo2.service;

import com.example.demo2.domain.A;
import com.example.demo2.domain.B;
import org.springframework.stereotype.Component;

@Component
public class Adder {
    private A a;

    private B b;


    public Adder(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a.getA() + b.getB();
    }
}
