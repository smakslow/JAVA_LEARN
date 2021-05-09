package leetcode.weekly_contest._86;

public class A {
    class Solution {
        public int numMagicSquaresInside(int[][] grid) {
            int n = grid.length;
            if(n < 3) return 0;
            int m = grid[0].length;
            if(m < 3) return 0;

            return 0;
        }

        private boolean judge(int[][] grid,int i,int j){
            int res = 0;
            for (int k = 0; k < 3; k++) {
                res += grid[i][k];
            }

            return true;
        }
    }
}
