package algorithm.niuke.niuke_recruit._vivo2021aut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class C {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int startX, startY, endX, endY;
    static int N = 10010;
    static char[][] chars = new char[N][N];

    static int n;

    public static void main(String[] args) throws IOException {
        n = nextInt();
        startX = nextInt();
        startY = nextInt();
        endX = nextInt();
        endY = nextInt();
        for (int i = 0; i < n; i++) {
            String t = next();
            for (int j = 0; j < n; j++) {
                chars[i][j] = t.charAt(j);
            }
        }
        out.println(bfs(chars));
        out.flush();
        out.close();
    }

    private static boolean check(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n && chars[x][y] != '#' && chars[x][y] != '@';
    }

    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};

    private static int bfs(char[][] chars) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][n];
        q.offer(new int[]{startX, startY, 0});
        vis[startX][startY] = true;
        while (!q.isEmpty()) {
            int[] point = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = point[0] + dx[i];
                int y = point[1] + dy[i];
                if (check(x, y) && !vis[x][y]) {
                    vis[x][y] = true;
                    if (x == endX && y == endY) {
                        return point[2] + 1;
                    }
                    q.offer(new int[]{x, y, point[2] + 1});
                }
            }
        }
        return -1;
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(in.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}
