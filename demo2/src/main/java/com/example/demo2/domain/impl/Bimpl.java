package com.example.demo2.domain.impl;

import com.example.demo2.domain.A;
import com.example.demo2.domain.B;
import org.springframework.stereotype.Component;

@Component
public class Bimpl implements B {

    private A a;

    public Bimpl(A a){
        this.a = a;
    }
    @Override
    public int getB() {
        return a.getA();
    }
}
