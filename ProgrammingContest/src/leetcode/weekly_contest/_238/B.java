package leetcode.weekly_contest._238;

import java.util.Arrays;

public class B {
    class Solution {
        public int maxFrequency(int[] nums, int k) {
            Arrays.sort(nums);
            int n = nums.length;
            long[] arr = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = nums[i - 1] + arr[i - 1];
            }
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                int low = 1, high = i;
                while (low <= high) {
                    int mid = (low + high) >> 1;
                    long need = (long) nums[i - 1] * (i - mid + 1);
                    long now = arr[i] - arr[mid - 1];
                    if (need - now > k) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                ans = Math.max(ans, i - low + 1);
            }
            return ans;
        }
    }
}
