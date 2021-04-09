package com.smalsow.javapractice.chart1;

import java.util.function.Function;

/**
 * @author stark_h
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Integer apply = function.apply("54321");
        System.out.println(apply);


        Function<String,Integer> function1  =s -> s.length();
        System.out.println(function1.apply("12312312"));
    }
}
