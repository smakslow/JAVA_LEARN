package com.smakslow.javapractice.chart2;

import org.junit.Test;

import java.util.function.Function;

public class PredicateTest {
    @Test
    public  void test1(){
        Function<String,Integer> function = String::length;
        System.out.println(function.apply("142412"));
    }
}
