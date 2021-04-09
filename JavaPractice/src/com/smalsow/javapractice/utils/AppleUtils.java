package com.smalsow.javapractice.utils;

import com.smalsow.javapractice.entity.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class AppleUtils {
    public static List<Apple>  createApples(){
        String[] colors = new String[]{"RED", "BLUE", "YELLOW", "GREEN"};
        Random random = new Random();
        List<Apple> appleList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Apple apple = new Apple();
            double height = random.nextDouble() * 10;
            apple.setWeight(height);

            int sort = random.nextInt(4);
            apple.setColor(colors[sort]);
            appleList.add(apple);
        }
        return appleList;
    }
}
