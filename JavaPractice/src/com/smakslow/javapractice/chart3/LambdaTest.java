package com.smakslow.javapractice.chart3;

import com.smakslow.javapractice.entity.Apple;
import com.smakslow.javapractice.utils.AppleUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest {

    @Test
    public void test1() {
        List<Apple> apples1 = AppleUtils.createApples();
        apples1.forEach(System.out::println);
        //List<Apple> apples = apples1.sort( ());
        System.out.println();
        List<Apple> appleList = apples1.stream().filter(apple -> apple.getColor().isEmpty()).collect(Collectors.toList());
        List<Apple> appleList1 = apples1.stream().filter(apple -> "RED".equals(apple.getColor())).collect(Collectors.toList());
        for (Apple apple : appleList) {
            System.out.println(apple);
        }
        System.out.println();

        appleList1.forEach(System.out::println);
        System.out.println();
        appleList1.forEach(System.out::println);


        System.out.println();
        //Predicate<String> predicate = String :: isEmpty;
        //Predicate<String> predicate = s ->  s.length() > 0;
        Predicate<String> predicate = s -> !s.isEmpty();
        Stream<String> stringStream = apples1.stream().map(Apple::getColor).filter(predicate);
        List<String> collect = stringStream.collect(Collectors.toList());
        System.out.println(collect);

        System.out.println();

        IntBinaryOperator intBinaryOperator = Math :: multiplyExact;

        int i = intBinaryOperator.applyAsInt(100, 2);
        System.out.println(i);

    }


    @Test
    public void test2() {
        List<Integer> integers = Arrays.asList(1, 2, 2, 512, 31);
        Consumer<List> consumer = System.out::println;
        consumer.accept(integers);


        IntPredicate ints = i -> i % 2 == 0;
        System.out.println(ints.test(1000));

    }

    @Test
    public  void test3(){
        ConcurrentHashMap<String, Integer> hashMap = new ConcurrentHashMap<>();
        HashMap<String, Integer> hashMap1 = new HashMap<>();
    }

}
