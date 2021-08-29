package leetcode.weekly_contest._255;

import java.util.Arrays;

public class A {
    class Solution {
        public int findGCD(int[] nums) {
            Arrays.sort(nums);
            int min = nums[0], max = nums[nums.length - 1];
            int ans = 1;
            for (int i = 2; i <= max; i++) {
                if ((min % i) == 0 && (max % i) == 0) ans = i;
            }
            return ans;
        }
    }
}
