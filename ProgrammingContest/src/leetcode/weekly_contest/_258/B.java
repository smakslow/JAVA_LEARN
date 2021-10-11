package leetcode.weekly_contest._258;

import java.util.HashMap;

public class B {
    class Solution {
        public long interchangeableRectangles(int[][] rectangles) {
            HashMap<Double, Long> map = new HashMap<>();
            for (int[] rectangle : rectangles) {
                double x = rectangle[1] * 1.0 / rectangle[0];
                map.put(x, map.getOrDefault(x, 0L) + 1);
            }
            long ans = 0;
            for (long value : map.values()) {
                ans += (value) * (value - 1) / 2;
            }
            return ans;
        }
    }
}
