package leetcode.biweekly_contest._55;

public class C {
    class Solution {
        int N = 100010;
        long[][] f = new long[N][2];
        int[] a = new int[N];

        public long maxAlternatingSum(int[] nums) {
            int n = nums.length;
            System.arraycopy(nums, 0, a, 1, n);
            f[0][0] = 0;
            f[0][1] = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                f[i][0] = Math.max(f[i - 1][0], f[i - 1][1] - a[i]);
                f[i][1] = Math.max(f[i - 1][1], f[i - 1][0] + a[i]);
            }
            return Math.max(f[n][0], f[n][1]);
        }
    }
}
