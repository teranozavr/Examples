package com.example.demo1.domain.impl;

import com.example.demo1.domain.A;
import com.example.demo1.domain.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bimpl implements B {
    @Autowired
    private A a;

    @Override
    public int getB() {
        return a.getA();
    }
}
