package leetcode.lcp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LCP03 {
    class Solution {
        public boolean robot(String command, int[][] obstacles, int x, int y) {
            char[] chars = command.toCharArray();
            HashMap<Integer, Set<Integer>> map = new HashMap<>();
            for (int[] obstacle : obstacles) {
                Set<Integer> set = map.getOrDefault(obstacle[0], new HashSet<>());
                set.add(obstacle[1]);
                map.put(obstacle[0], set);
            }
            int dy = 0, dx = 0;
            for (int i = 0; i < chars.length; ) {
                int aChar = chars[i];
                if (dx == x && dy == y) return true;
                if (aChar == 'U') {
                    dy++;
                }else if (aChar == 'R') {
                    dx++;
                }
                if (map.containsKey(dx) && map.get(dx).contains(dy))
                    return false;
                i++;
                if (dx > x || dy > y) break;
                if (i == chars.length) i = 0;
            }
            return false;
        }
    }
}
