package leetcode.weeklyrace._233;

public class D {
    class Solution {
        public int countPairs(int[] nums, int low, int high) {
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 1; j < nums.length; j++) {
                    int temp = nums[i] ^ nums[j];
                    if (temp >= low && temp <= high) {
                        res++;
                    }
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {

    }
}
