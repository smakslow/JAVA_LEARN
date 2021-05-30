package 挑战程序设计竞赛;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class POJ2386 {
    private static char[][] chars;
    private static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        String s;
        chars = new char[N][M];
        for (int i = 0; i < N; i++) {
            s = reader.readLine();
            for (int j = 0; j < M; j++) {
                chars[i][j] = s.charAt(j);
            }
        }
        reader.close();
        System.out.println(solve());
    }

    private static int solve() {
        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (chars[i][j] == 'W') {
                    dfs(i, j);
                    res++;
                }
            }
        }
        return res;
    }

    private static void dfs(int x, int y) {
        chars[x][y] = '.';
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                int nx = x + dx, ny = y + dy;
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && chars[nx][ny] == 'W') {
                    dfs(nx, ny);
                }
            }
        }
    }
}
