package leetcode.lcp;

import java.util.HashMap;

public class LCP39 {
    class Solution {
        public int minimumSwitchingTimes(int[][] source, int[][] target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int[] ints : source) {
                for (int i : ints) {
                    map.put(i, map.getOrDefault(i, 0) + 1);
                }
            }
            int ans = 0;
            for (int[] ints : target) {
                for (int i : ints) {
                    map.put(i, map.getOrDefault(i, 0) - 1);
                }
            }

            for (int value : map.values()) {
                if (value != 0) ans += Math.abs(value);
            }
            return ans >> 1;
        }
    }
}
