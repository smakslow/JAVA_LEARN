package leetcode.weekly_contest._258;

public class C {
    class Solution {
        int ans = 0;

        public int maxProduct(String s) {
            char[] chars = s.toCharArray();
            CalSum(chars);
            return ans;
        }

        private void CalSum(char[] ch) {
            int len = ch.length;
            int bit = 1 << len;
            for (int i = 1; i < bit; i++) {
                StringBuilder s1 = new StringBuilder();
                StringBuilder s2 = new StringBuilder();
                for (int j = 0; j < len; j++) {
                    if ((i & 1 << j) != 0)
                        s1.append(ch[j]);
                    else
                        s2.append(ch[j]);
                }
                int a = maxLen(s1.toString());
                int b = maxLen(s2.toString());
                ans = Math.max(a * b, ans);
            }
        }

        public int maxLen(String s) {
            int n = s.length();
            if(n == 0) return 0;
            int[][] dp = new int[n][n];
            for (int i = n - 1; i >= 0; i--) {
                dp[i][i] = 1;
                char c1 = s.charAt(i);
                for (int j = i + 1; j < n; j++) {
                    char c2 = s.charAt(j);
                    if (c1 == c2) {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    } else {
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                    }
                }
            }
            return dp[0][n - 1];
        }
    }
}
