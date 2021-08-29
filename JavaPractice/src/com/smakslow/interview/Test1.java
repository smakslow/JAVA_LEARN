package com.smakslow.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("12", "21", "3", "4", "5");
        list.sort(comparingInt(String::length));
        System.out.println(list.toString());


        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squaresList.toString());
        List<List<String>> stringlist =  new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringlist.add(Arrays.asList("aaaav", "bbbbc", "ddddde", "ffffx"));
        }
        List<String> strings1 = stringlist.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(strings1);
        List<String> strings2 = Arrays.asList("abc","","bc","efg","abcd"," ","jkl");
        List<String> filtered = strings2.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选列表: " + filtered);
        String mergedString = String.join(",", strings2);
        System.out.println("合并字符串: " + mergedString);
    }
}
