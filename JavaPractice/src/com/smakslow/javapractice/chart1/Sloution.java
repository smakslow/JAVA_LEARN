package com.smakslow.javapractice.chart1;


import java.io.IOException;

/* 给你一个由?'1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
此外，你可以假设该网格的四条边均被水包围。
示例 1：
输入：grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
输出：1
示例 2：
输入：grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
输出：3


提示：
m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] 的值为 '0' 或 '1'

 */
public class Sloution {
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static int[][] g;
    static int n, m;

    static void dfs(int x, int y) {
        g[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int newx = x + dx[i];
            int newy = y + dy[i];
            if (check(newx, newy) && g[newx][newy] == 1) {
                dfs(newx, newy);
            }
        }
    }

    private static boolean check(int newx, int newy) {
        return newx >= 0 && newx < n && newy >= 0 && newy < m;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(System.in.available());
        int[][] arr = new int[][]{{1, 1, 1, 1, 0}};
        g = arr;
        n = arr.length;
        m = arr[0].length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 1) {
                    System.out.println(i + " " + j);
                    dfs(i, j);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }


}
