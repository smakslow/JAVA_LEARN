package leetcode.biweeklyrace._48;

import java.util.Arrays;

public class C {
    public class Solution {
        public int coinChange(int[] coins, int amount) {
            int max = amount + 1;
            int[] dp = new int[amount + 1];
            Arrays.fill(dp, max);
            dp[0] = 0;
            for (int i = 1; i <= amount; i++) {
                for (int j = 0; j < coins.length; j++) {
                    if (coins[j] <= i) {
                        dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                    }
                }
            }
            int res = 1;
            for (int i = 1; i <= amount; i++) {
                if(dp[i] > amount) break;
                res++;
            }
            return dp[amount] > amount ? -1 : dp[amount];
        }
    }
}
