package com.smakslow.javapractice.chart1;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        ArrayList<Object> arrayList = new ArrayList<>();
        map.put("111", "233");
        String oldvalue = (String) map.put("111", "222");
        System.out.println(oldvalue);
        map.forEach((key, value) ->
                System.out.println("key" + key + "  " + "value" + value));
    }
}
