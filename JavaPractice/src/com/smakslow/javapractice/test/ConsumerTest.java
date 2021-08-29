package com.smakslow.javapractice.test;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Integer> consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };

        consumer.accept(123);

        Consumer<String> consumer1 = s -> System.out.println(s);
        Consumer<String> consumer2 = System.out :: println;
        consumer1.accept("consumer1");
        consumer2.accept("consumer2");
    }
}
