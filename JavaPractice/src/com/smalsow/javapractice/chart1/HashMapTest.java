package com.smalsow.javapractice.chart1;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        ArrayList<Object> arrayList = new ArrayList<>();
        map.put("111","222");
        map.put("111","233");
        map.forEach( (key,value)->
                System.out.println( "key" + key +"  " +"value" + value));
    }
}
