package leetcode.weekly_contest._235;

import java.util.HashSet;

public class D {
    class Solution {
        public int countDifferentSubsequenceGCDs(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }
            return set.size();
        }
    }
}
