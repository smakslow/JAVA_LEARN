package leetcode.weekly_contest._261;

import java.util.Arrays;

public class B {
    class Solution {
        public int[] missingRolls(int[] rolls, int avg, int n) {
            int m = rolls.length;
            int total = (m + n) * avg;
            int left = Arrays.stream(rolls).sum();
            int right = total - left;
            int ravg = right / n;
            if (right * 1.0 / n > 6 || right * 1.0 / n < 1) return new int[]{};
            int[] ans = new int[n];
            int x = ravg, t = n, s = right;
            for (int i = 0; i < n - 1; i++) {
                ans[i] = x;
                t--;
                s -= x;
                x = s / t;
            }
            int a = Arrays.stream(ans).sum();
            ans[n - 1] = right - a;
            return ans;
        }
    }
}
