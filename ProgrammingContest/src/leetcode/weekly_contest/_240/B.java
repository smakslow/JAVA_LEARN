package leetcode.weekly_contest._240;

public class B {
    class Solution {
        public int maxDistance(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int m = nums2.length;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int j = binary(nums2, i, m - 1, nums1[i]);
                ans = Math.max(j - i - 1, ans);
            }
            return ans;
        }

        public int binary(int[] arr, int left, int right, int target) {
            while (left < right) {
                int mid = (left + right) >> 1;
                if (arr[mid] > target) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            }
            return left;
        }
    }
}
