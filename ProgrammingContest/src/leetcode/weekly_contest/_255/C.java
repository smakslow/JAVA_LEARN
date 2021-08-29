package leetcode.weekly_contest._255;

public class C {
    class Solution {
        int N = 70;
        int V = N << 1;
        boolean[][] dp = new boolean[N][V];

        public int minimizeTheDifference(int[][] mat, int target) {
            int n = mat.length, m = mat[0].length;
            for (int i = 0; i < m; i++) {
                dp[0][mat[0][i]] = true;
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < V; j++) {
                    if (!dp[i - 1][j]) continue;
                    for (int k = 0; k < m; k++) {
                        if (j + mat[i][k] >= V) continue;
                        dp[i][j + mat[i][k]] = true;
                    }
                }
            }
            int ans = V + 5;
            for (int i = 0; i < V; i++) {
                if (dp[n - 1][i]) {
                    System.out.println(target - i);
                    ans = Math.min(ans, Math.abs(target - i));
                }
            }
            return ans;
        }
    }
}
