package leetcode.weekly_contest._246;

public class C {
    class Solution {
        int[][] g1;
        int[][] g2;
        boolean[][] visited;
        int n;
        int m;
        int[][] dirs = new int[][]{
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };
        public boolean search(int x, int y){
            if(x < 0 || x >= n || y < 0 || y >= m){
                return true;
            }
            if(g2[x][y] == 0){
                return true;
            }
            if(g1[x][y] == 0){
                return false;
            }
            if(visited[x][y]){
                return true;
            }
            visited[x][y] = true;
            boolean ans = true;
            for(int[] d : dirs){
                int nx = d[0] + x;
                int ny = d[1] + y;
                boolean res = search(nx, ny);
                ans = ans && res;
            }
            return ans;
        }

        public int countSubIslands(int[][] grid1, int[][] grid2) {
            g1 = grid1;
            g2 = grid2;
            n = g1.length;
            m = g1[0].length;
            visited = new boolean[n][m];
            int ans = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(!visited[i][j] && g2[i][j] == 1){
                        boolean ok = search(i, j);
                        ans += ok ? 1 : 0;
                    }
                }
            }
            return ans;
        }
    }
}
