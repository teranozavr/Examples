package com.example.demo1.domain.impl;

import com.example.demo1.domain.A;
import com.example.demo1.domain.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AImpl implements A {
    @Autowired
    private B b;

    @Override
    public int getA() {
        return b.getB();
    }
}
