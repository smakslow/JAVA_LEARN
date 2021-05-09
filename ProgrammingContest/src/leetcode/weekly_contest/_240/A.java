package leetcode.weekly_contest._240;

public class A {
    class Solution {
        public int maximumPopulation(int[][] logs) {
            int[] cnt = new int[2051];
            for (int[] log : logs) {
                int b = log[0];
                int d = log[1];
                for (int i = b; i < d; i++) {
                    cnt[i]++;
                }
            }
            int max = Integer.MIN_VALUE;
            int ans = 0;
            for (int i = 1950; i <= 2050; i++) {
                if (cnt[i] > max) {
                    max = cnt[i];
                    ans = i;
                }
            }
            return ans;
        }
    }
}
