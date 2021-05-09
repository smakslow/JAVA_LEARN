package com.smalsow.interview;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("12", "21", "3", "4", "5");
        list.sort(comparingInt(String::length));
        System.out.println(list.toString());

    }
}
