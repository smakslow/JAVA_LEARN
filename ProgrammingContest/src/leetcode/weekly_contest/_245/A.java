package leetcode.weekly_contest._245;

import java.util.HashMap;

public class A {
    class Solution {
        public boolean makeEqual(String[] words) {
            HashMap<Character, Integer> map = new HashMap<>();
            int n = words.length;
            for (String word : words) {
                for (int i = 0; i < word.length(); i++) {
                    map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
                }
            }
            for (int value : map.values()) {
                if (value % n != 0) return false;
            }
            return true;
        }
    }
}
