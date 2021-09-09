package leetcode.biweekly_contest._60;

import java.util.ArrayList;

public class B {
    class Solution {
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        int[][] grid;
        int n, m;
        int a, b;

        void dfs(int x, int y) {
            grid[x][y] = 0;
            for (int i = 0; i < 4; i++) {
                int newx = dx[i] + x;
                int newy = dy[i] + y;
                if (newx >= 0 && newx < n && newy >= 0 && newy < m && grid[newx][newy] == 1) {
                    a = Math.max(a, newx);
                    b = Math.max(b, newy);
                    dfs(newx, newy);
                }
            }
        }

        public int[][] findFarmland(int[][] land) {
            this.grid = land;
            n = grid.length;
            m = grid[0].length;
            ArrayList<int[]> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 1) {
                        a = i;
                        b = j;
                        dfs(i, j);
                        ans.add(new int[]{i, j, a, b});
                    }
                }
            }
            return ans.toArray(new int[ans.size()][1]);
        }
    }
}
