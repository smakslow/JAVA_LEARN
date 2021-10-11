package leetcode.weekly_contest._262;

import java.util.Arrays;

public class B {

    class Solution {
        public int minOperations(int[][] grid, int x) {
            int m = grid.length;
            int n = grid[0].length;
            int len = m * n;
            int[] arr = new int[len];
            int idx = 0;
            for (int[] rows : grid) {
                for (int j = 0; j < n; j++) {
                    arr[idx++] = rows[j];
                }
            }
            Arrays.sort(arr);
            int mid = arr[len >> 1];
            int ans = 0;
            for (int i : arr) {
                int abs = Math.abs(i - mid);
                if (abs % x != 0) return -1;
                ans += abs / x;
            }
            return ans;
        }
    }
}
