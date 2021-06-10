package niukecontest;

import java.util.HashMap;
import java.util.Map;

public class bytedance {
    static void zj1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put((c), map.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> newMap = new HashMap<>();
        int[] ans = new int[]{0, s.length() - 1};
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            newMap.put(cur, newMap.getOrDefault(cur, 0) + 1);
            while (newMap.size() >= map.size()) {
                if (i - l < ans[1] - ans[0]) {
                    ans = new int[]{l, i};
                }
                char cl = s.charAt(l);
                int cnt = newMap.get(cl);
                if (cnt <= 1) {
                    newMap.remove(cl);
                } else {
                    newMap.put(cl, cnt - 1);
                }
                l++;
            }
        }
        System.out.println(ans[0] + "," + (ans[1] - ans[0] + 1));
    }


}
