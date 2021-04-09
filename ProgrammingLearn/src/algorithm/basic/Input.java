package algorithm.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Input {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("zhangsan", "1");
        concurrentHashMap.put("lisi", "2");
        concurrentHashMap.put("wangwu", "3");

        for (String s : concurrentHashMap.keySet()) {
            System.out.println(concurrentHashMap.get(s));//通过键获取值
        }

        for (Map.Entry<String, String> stringStringEntry : concurrentHashMap.entrySet()) {
            System.out.println(stringStringEntry.getKey() + "----" + stringStringEntry.getValue());
        }

        Iterator<Map.Entry<String, String>> iterator = concurrentHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + "******" + next.getValue());
        }

        try {
            String readLine = bufferedReader.readLine();
            System.out.println(readLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
