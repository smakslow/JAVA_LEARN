package leetcode.biweekly_contest._55;

public class A {
    class Solution {
        public boolean canBeIncreasing(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                int last = -1;
                for (int j = 0; j < n; j++) {
                    if (i == j) continue;
                    if (nums[j] <= last) flag = false;
                    last = nums[j];
                }
                if (flag) return true;
            }
            return false;
        }
    }
}
