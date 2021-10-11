package leetcode.lcp;

public class LCP41 {
    class Solution {
        int n, m;
        int ans = 0;
        int dx[] = {1, 1, 1, 0, 0, -1, -1, -1};
        int dy[] = {0, -1, 1, -1, 1, 0, -1, 1};
        char g[][];
        boolean visited[][];
        char black = 'X', white = 'O';


        int dfs(int i, int j) {
            int t = 0;
            for (int k = 0; k < dx.length; k++) {
                int x = i + dx[k], y = j + dy[k];
                int d = 0;
                boolean falg = false;
                while (x >= 0 && x < n && y >= 0 && y < m && g[x][y] != '.') {
                    if (g[x][y] == black) {
                        falg = true;
                        break;
                    }
                    x += dx[k];
                    y += dy[k];
                    d++;
                }
                if (falg && d > 0) {
                    t += d;
                    int tx = i, ty = j;
                    for (int l = 0; l < d; l++) {
                        tx += dx[k];
                        ty += dy[k];
                        visited[tx][ty] = true;
                        g[tx][ty] = black;
                    }
                    tx = i;
                    ty = j;
                    for (int l = 0; l < d; l++) {
                        tx += dx[k];
                        ty += dy[k];
                        t += dfs(tx, ty);
                    }
                }
            }
            return t;
        }

        public int flipChess(String[] chessboard) {
            n = chessboard.length;
            m = chessboard[0].length();
            g = new char[n][m];
            visited = new boolean[n][m];
            int idx = 0;
            for (String s : chessboard) {
                g[idx++] = s.toCharArray();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (g[i][j] == '.') { //能放黑棋的位置
                        g[i][j] = black;
                        int t = dfs(i, j);
                        ans = Math.max(ans, t);
                        g[i][j] = '.';
                        if (t > 0) {
                            for (int k = 0; k < n; k++) {
                                for (int l = 0; l < m; l++) {  //还原
                                    if (visited[k][l]) {
                                        visited[k][l] = false;
                                        g[k][l] = white;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

}
