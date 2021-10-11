package com.smakslow.javapractice.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapTest {

    @Test
    public void groupBy(){
        HashMap<String, List<String>> listHashMap = new HashMap<>();
        for (int i = 100; i > 0; i--) {
            if ( i < 10){
                List<String> strings = listHashMap.get("0-9");

                if (strings == null){
                    strings = new ArrayList<>();
                    listHashMap.put("0-9",strings);
                }
                strings.add(i+"");
            }
        }

        List<String> stringList = listHashMap.get("0-9");
        for (String s : stringList) {
            System.out.println(s);
        }
        stringList.sort(String::compareTo);
        System.out.println(stringList);
    }
}
