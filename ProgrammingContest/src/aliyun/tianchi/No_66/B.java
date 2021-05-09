package aliyun.tianchi.No_66;

import java.util.HashMap;

public class B {
    public int findX(int[] arr) {
        // write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int num : map.keySet()) {
            if(num == map.get(num)){
                res = Math.max(num,res);
            }
        }
        return res;
    }
}
