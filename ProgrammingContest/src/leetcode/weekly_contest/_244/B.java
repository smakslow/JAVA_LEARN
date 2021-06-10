package leetcode.weekly_contest._244;

import java.util.TreeMap;

public class B {
    class Solution {
        public int reductionOperations(int[] nums) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            if (!map.isEmpty()) map.remove(map.firstKey());
            int ans = 0;
            int index = 1;
            for (int value : map.values()) {
                ans += value * index;
                index++;
            }
            return ans;
        }
    }
}
