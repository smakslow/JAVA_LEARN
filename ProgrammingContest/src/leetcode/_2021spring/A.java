package leetcode._2021spring;

import java.util.Arrays;

public class A {
    class Solution {
        public int purchasePlans(int[] nums, int target) {
            int mod = 1000000007;
            Arrays.sort(nums);
            long res = 0;
            int i = 0;
            int j = nums.length - 1;
            while (i < j) {
                while (i < j && nums[i] + nums[j] <= target) {
                    i++;
                }
                while (i < j &&nums[i] + nums[j] >= target) {
                    j--;
                }
            }
            return (int) (res % mod);
        }
    }
}
