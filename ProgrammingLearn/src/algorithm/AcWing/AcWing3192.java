package algorithm.AcWing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AcWing3192 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        reader.close();
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = Integer.parseInt(str[i]);
            map.put(temp,map.getOrDefault(temp, 0) + 1);
        }
        int res = 0;
        temp = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > temp){
                temp = entry.getValue();
                res = entry.getKey();
            }else if(entry.getValue() == temp){
                if(entry.getKey() < res){
                    res = entry.getKey();
                }
            }
        }
        System.out.println(res);
    }
}
