package leetcode.biweekly_contest._53;

import java.util.Arrays;

public class B {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int n = nums.length;
        int mid = n >> 1;
        for (int i = 0; i < mid; i++, n--) {
            ans = Math.max(nums[i] + nums[n - 1], ans);
        }
        return ans;
    }
}
