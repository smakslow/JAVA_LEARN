package aliyun.tianchi.No_63;

import java.util.HashMap;

public class C {
    public String[] DistinguishUsername(String[] names) {
        // Write your code here
        HashMap<String, Integer> map = new HashMap<>();
        int n = names.length;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            if (map.containsKey(names[i])){
                Integer integer = map.get(names[i]);
                ans[i] = names[i] + integer;
                map.replace(names[i],integer + 1);
            }else {
                map.put(names[i],1);
                ans[i] = names[i];
            }
        }
        return ans;
    }
}
