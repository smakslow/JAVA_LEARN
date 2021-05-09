package leetcode.weekly_contest._87;

public class B {
    class Solution {
        public int longestMountain(int[] arr) {
            if (arr == null || arr.length == 0) return 0;
            int res = 0;
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int left = i, right = i;
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                res = Math.max(right - left + 1, res);
                while(i < n && arr[i] == arr[i - 1]) i++;
            }
            return res;
        }
    }

}
