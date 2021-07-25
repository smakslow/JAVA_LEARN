package leetcode.daily;

import java.util.*;

public class _451 {
    class Solution {
        public String frequencySort(String s) {
            Map<Character, Integer> map = new HashMap<>();
            int length = s.length();
            for (int i = 0; i < length; i++) {
                char c = s.charAt(i);
                int frequency = map.getOrDefault(c, 0) + 1;
                map.put(c, frequency);
            }
            List<Character> list = new ArrayList<>(map.keySet());
            list.sort((a, b) -> map.get(b) - map.get(a));
            StringBuilder sb = new StringBuilder();
            for (char c : list) {
                int frequency = map.get(c);
                for (int j = 0; j < frequency; j++) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }
}
