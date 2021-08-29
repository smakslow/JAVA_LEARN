package com.smakslow.javapractice.test;

import java.util.ArrayList;

/**
 * @author stark_h
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("zhangsan");
        strings.add("wangwu");
        strings.forEach(k -> System.out.println(k));
        strings.forEach(System.out :: println);
    }
}
