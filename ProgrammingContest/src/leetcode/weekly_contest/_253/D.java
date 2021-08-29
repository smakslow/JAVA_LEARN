package leetcode.weekly_contest._253;

import java.util.Arrays;

public class D {
    class Solution {
        int maxn = 10001;
        int[] low = new int[maxn];
        int[] a = new int[maxn];

        public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
            int n = obstacles.length;
            int[] ans = new int[n];
            Arrays.fill(low, Integer.MAX_VALUE);
            System.arraycopy(a, 0, obstacles, 1, n);
            low[1] = a[1];
            int lis = 1, index = 0;
            ans[index] = lis;
            for (int i = 2; i <= n; i++) {
                if (a[i] > low[lis]) low[++lis] = a[i];
                else low[binary_search(low, lis, a[i])] = a[i];
                ans[++index] = lis;
            }
            return ans;
        }

        int binary_search(int[] a, int R, int x) {
            int L = 1, mid;
            while (L <= R) {
                mid = (L + R) >> 1;
                if (a[mid] <= x)
                    L = mid + 1;
                else
                    R = mid - 1;
            }
            return L;
        }
    }
}
