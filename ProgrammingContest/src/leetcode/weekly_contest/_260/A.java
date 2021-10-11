package leetcode.weekly_contest._260;

public class A {
    class Solution {
        public int maximumDifference(int[] nums) {
            int ans = -1;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > nums[i])
                        ans = Math.max(nums[j] - nums[i], ans);
                }
            }
            return ans;
        }
    }
}
