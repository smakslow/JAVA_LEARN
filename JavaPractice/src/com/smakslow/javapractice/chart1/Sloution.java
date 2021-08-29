package com.smakslow.javapractice.chart1;


import java.io.IOException;

/* ����һ����?'1'��½�أ��� '0'��ˮ����ɵĵĶ�ά����������������е����������
�������Ǳ�ˮ��Χ������ÿ������ֻ����ˮƽ�����/����ֱ���������ڵ�½�������γɡ�
���⣬����Լ��������������߾���ˮ��Χ��
ʾ�� 1��
���룺grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
�����1
ʾ�� 2��
���룺grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
�����3


��ʾ��
m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] ��ֵΪ '0' �� '1'

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
