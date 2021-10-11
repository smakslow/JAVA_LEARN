package leetcode.lcp;

import java.util.Arrays;

public class LCP33 {
    class Solution {
        public int storeWater(int[] bucket, int[] vat) {
            int maxK = Arrays.stream(bucket).max().getAsInt();
            int ans = Integer.MAX_VALUE;
            for (int k = 1; k <= maxK; k++) {
                if (k >= ans) {
                    break;
                }
                int cur = k;
                for (int i = 0; i < vat.length; i++) {
                    cur += Math.max(vat[i] / k + (vat[i] % k == 0 ? 0 : 1) - bucket[i], 0);
                }
                ans = Math.min(ans, cur);
            }
            return ans == Integer.MAX_VALUE ? 0 : ans;
        }
    }
}
