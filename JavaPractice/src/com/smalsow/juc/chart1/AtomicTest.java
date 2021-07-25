package com.smalsow.juc.chart1;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
    AtomicInteger atomicInteger = new AtomicInteger(0);
    void increment(){
        atomicInteger.incrementAndGet();
    }
    public static void main(String[] args) {
        AtomicTest test = new AtomicTest();
        for (int i = 0; i < 100; i++) {
            test.increment();
            System.out.println(test.atomicInteger);
        }

    }
}
