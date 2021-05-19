package leetcode.biweekly_contest._52;

import java.util.Arrays;

public class D {
    class Solution {
        int N = 10010;
        int[] s = new int[N];

        public int sumOfFlooredPairs(int[] nums) {
            Arrays.fill(s, 0);
            for (int num : nums) {
                s[num]++;
            }
            for (int i = 1; i < N; i ++ ) s[i] += s[i - 1];
            long ans = 0;
            for (int i = 1; i < N; i++) {
                for (int j = 1; j * i < N; j++) {
                    int l = j * i, r = Math.min(N - 1, (j + 1) * i - 1);
                    long sum = (long) (s[r] - s[l - 1]) * j % 1000000007;
                    ans = (ans + sum * (s[i] - s[i - 1])) % 1000000007;
                }
            }
            return (int) ans;
        }
    }
}
