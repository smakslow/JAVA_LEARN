package leetcode.weekly_contest._241;

public class A {
    class Solution {
        public int subsetXORSum(int[] nums) {
            int n = nums.length;
            int ans = 0;
            for (int mask = 0; mask < (1 << n); ++mask) {
                int x = 0;
                for (int i = 0; i < n; ++i) {
                    if ((mask & (1 << i)) != 0) {
                        x ^= nums[i];
                    }
                }
                ans += x;
            }
            return ans;
        }
    }


}
