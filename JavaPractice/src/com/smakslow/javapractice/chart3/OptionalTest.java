package com.smakslow.javapractice.chart3;

import com.smakslow.javapractice.entity.Apple;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void test(){
        String str = "hello";
        //str = null;
        Optional<String> optional = Optional.of(str);
        String s = optional.get();
        System.out.println(s);
    }

    @Test
    public void test2(){
        Apple apple = new Apple();
        apple = null;
        Optional<Apple> apple1 = Optional.ofNullable(apple);
        Apple blue = apple1.orElse(new Apple("blue", 0.12));
        Apple apple2 = apple1.get();
        System.out.println(apple2);
    }
}
