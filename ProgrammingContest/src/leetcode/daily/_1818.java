package leetcode.daily;

public class _1818 {
    class Solution {
        public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
            final int mod = 1000000007;
            int n = nums1.length;
            int[] rec = new int[n];
            System.arraycopy(nums1, 0, rec, 0, n);
            int sum = 0, maxn = 0;

            return (sum - maxn + mod) % mod;
        }
    }
}
