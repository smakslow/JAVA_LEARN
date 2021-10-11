package leetcode.biweekly_contest._62;


import java.util.HashMap;

public class D {
    class Solution {
        public int waysToPartition(int[] nums, int k) {
            int n = nums.length;
            long[] arr = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = arr[i - 1] + nums[i - 1];
            }
            int ans = 0;
            long sum = arr[n];
            for (int i = 1; i < n; i++) {
                if (sum - arr[i] == arr[i]) ans++;
            }
            HashMap<Long, Integer> left = new HashMap<>();
            HashMap<Long, Integer> right = new HashMap<>();
            for (int i = n; i >= 1; i--) {
                long l = arr[i - 1];
                long r = arr[n] - l;
                right.put(r - l, right.getOrDefault(r - l, 0) + 1);
            }
            for (int i = 1; i <= n; i++) {
                long l = arr[i - 1];
                long r = arr[n] - l;
                System.out.println(l + " " + r);
                if (i > 1)
                    left.put(l - r, left.getOrDefault(l - r, 0) + 1);
                right.put(r - l, right.getOrDefault(r - l, 0) - 1);
                ans = Math.max(ans, left.getOrDefault(k - nums[i - 1], 0) + right.getOrDefault(k - nums[i - 1], 0));
            }
            return ans;
        }
    }
}
