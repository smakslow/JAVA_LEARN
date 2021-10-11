package com.smakslow.javapractice.test;

import com.smakslow.javapractice.utils.MyMathUtils;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class AppleTest {
    public static void main(String[] args) {
        Function<Integer, Integer> add1 = MyMathUtils::add1;
        System.out.println(add1.apply(10));

        Function<Integer,Integer> add2 = MyMathUtils :: add2;
        System.out.println(add2.apply(20));
    }

    @Test
    void test(){

    }
}
