package leetcode.biweekly_contest._62;

public class A {
    class Solution {
        public int[][] construct2DArray(int[] original, int m, int n) {
            int len = original.length;
            if (m * n != len) return new int[][]{};
            int[][] ans = new int[m][n];
            int idx = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    ans[i][j] = original[idx++];
                }
            }
            return ans;
        }
    }
}
