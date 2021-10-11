package leetcode.biweekly_contest._61;

import java.util.Arrays;
import java.util.Comparator;

public class C {
    class Solution {
        public long maxTaxiEarnings(int n, int[][] rides) {
            long[] dp = new long[n + 1];
            Arrays.sort(rides, Comparator.comparingInt(a -> a[1]));
            int index = 0;
            for (int i = 1; i <= n; i++) {
                //���⳵��i-1λ���ߵ�iλ��,������ʱ��������������dp[i-1]
                dp[i] = dp[i - 1];
                while (index < rides.length && rides[index][1] <= i) {
                    //������iΪ�յ�������������ӯ��
                    dp[i] = Math.max(dp[i], dp[rides[index][0]] + rides[index][1] - rides[index][0] + rides[index][2]);
                    index++;
                }
            }
            return dp[n];
        }
    }
}
