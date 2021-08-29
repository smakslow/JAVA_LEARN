package leetcode.weekly_contest._256;

import java.util.Arrays;

public class A {
    class Solution {
        public int minimumDifference(int[] nums, int k) {
            Arrays.sort(nums);
            int n = nums.length;
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int j = i + k - 1;
                if (j < n)
                    ans = Math.min(ans, nums[j] - nums[i]);
            }
            return ans;
        }
    }
}
