package com.smakslow.javapractice.chart2;

import com.smakslow.javapractice.entity.Apple;
import com.smakslow.javapractice.utils.AppleUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AppleFilter {
    enum Color {
        RED,
        GREEN
    }

    public static List<Apple> filterApples(List<Apple> apples, Color color) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }


    @Test
    public void test1() {
        List<Apple> apples = AppleUtils.createApples();
        System.out.println(apples);
        List<Apple> apples1 = filterApples(apples, Color.GREEN);
        System.out.println(apples1);
        List<Apple> apples2 = filterApples(apples, Color.RED);
        System.out.println(apples2);
    }
}
