package leetcode.weekly_contest._240;

public class C {
    class Solution {
        int N = 100010;
        int[] left = new int[N];
        int[] right = new int[N];
        int[] h = new int[N];
        int[] q = new int[N];
        long[] sum = new long[N];

        public int maxSumMinProduct(int[] nums) {
            int n = nums.length;
            for (int i = 1; i <= n; i++) {
                h[i] = nums[i - 1];
                sum[i] = sum[i - 1] + h[i];
            }
            int tt = 0;
            for (int i = 1; i <= n; i++) {
                while (h[i] <= h[q[tt]]) tt--;
                left[i] = q[tt];
                q[++tt] = i;
            }
            tt = 0;
            q[0] = n + 1;
            for (int i = n; i > 0; i--) {
                while (h[i] <= h[q[tt]]) tt--;
                right[i] = q[tt];
                q[++tt] = i;
            }
            long ans = 0;
            for (int i = 1; i <= n; i++) {
                ans = Math.max(ans, h[i] * (sum[right[i] - 1] - sum[left[i]]));
            }
            return (int) (ans % (int) (1e9 + 7));
        }
    }
}
