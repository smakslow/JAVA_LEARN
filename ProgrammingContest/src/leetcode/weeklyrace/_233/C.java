package leetcode.weeklyrace._233;

public class C {
    class Solution {
        public int maxValue(int n, int index, int maxSum) {
            int res = 0;
            int left = index - 1;
            int right = n - index;
            int min = Math.min(left,right);
            for (int i = 0; i < min; i++) {
                res += (i * 2);
            }
            return  maxSum - res;
        }
    }
}
