package leetcode.weekly_contest._250;

public class C {
    class Solution {
        public long maxPoints(int[][] points) {
            int n = points.length;
            int m = points[0].length;
            long[][] dp = new long[n][m];
            for (int i = 0; i < m; i++) {
                dp[0][i] = points[0][1];
            }
            long[] left = new long[m];
            long[] right = new long[m];
            for (int i = 1; i < n; i++) {
                left[0] = dp[i - 1][0];
                right[m - 1] = dp[i - 1][m - 1] - m + 1;
                for (int j = 1; j < m; j++) {
                    left[j] = Math.max(left[j - 1], dp[i - 1][j] + j);
                }
                for (int j = m - 2; j >= 0; j--) {
                    right[j] = Math.max(right[j + 1], dp[i - 1][j] - j);
                }
                for (int j = 0; j < m; j++) {
                    dp[i][j] = Math.max(points[i][j] + left[j] - j, points[i][j] + right[j] + j);
                }
            }
            long ans = 0;
            for (int i = 0; i < m; i++) {
                ans = Math.max(ans, dp[n - 1][i]);
            }
            return ans;
        }
    }
}
