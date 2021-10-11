package leetcode.weekly_contest._260;

public class B {
    class Solution {
        public long gridGame(int[][] grid) {
            int n = grid[0].length;
            long[][] p1 = new long[2][n + 1];
            for(int i = 1; i <= n; i++) {
                p1[0][i] = p1[0][i - 1] + grid[0][i - 1];
                p1[1][i] = p1[1][i - 1] + grid[1][i - 1];
            }
            long ans = Long.MAX_VALUE;
            for(int i = 1; i <= n; i++) {
                ans = Math.min(ans, Math.max(p1[0][n] - p1[0][i], p1[1][i - 1]));
            }
            return ans;
        }
    }
}
