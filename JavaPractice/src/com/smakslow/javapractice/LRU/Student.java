package com.smakslow.javapractice.LRU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
    static int total = 0;
    static int count = 0;
    static int input = 0;

    static double sum() {
        return total;
    }

    static double average() {
        return total / count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = reader.readLine()) != null) {
            input = Integer.parseInt(str);
        }
    }
}
