package leetcode.weekly_contest._254;

import java.util.Arrays;

public class B {
    class Solution {
        public int[] rearrangeArray(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];
            Arrays.sort(nums);
            int first = 0, last = n - 1;
            for (int i = 0; i < n; i++) {
                if ((i & 1) == 0) ans[i] = nums[first++];
                else ans[i] = nums[last--];
            }
            return ans;
        }
    }
}
