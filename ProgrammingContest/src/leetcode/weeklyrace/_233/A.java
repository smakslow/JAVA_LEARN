package leetcode.weeklyrace._233;

public class A {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                int temp = 0;
                for (int j = i + 1; j < nums.length; ) {
                    if (nums[j] > nums[j - 1]) {
                        temp += nums[j - 1];
                        j++;
                    } else {
                        break;
                    }
                }
                res = Math.max(temp, res);
            }
            return res;
        }
    }
}
