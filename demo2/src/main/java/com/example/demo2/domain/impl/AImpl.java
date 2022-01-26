package com.example.demo2.domain.impl;

import com.example.demo2.domain.A;
import com.example.demo2.domain.B;
import org.springframework.stereotype.Component;

@Component
public class AImpl implements A {

    private B b;

    public AImpl(B b) {
        this.b = b;
    }

    @Override
    public int getA() {
        return b.getB();
    }
}
