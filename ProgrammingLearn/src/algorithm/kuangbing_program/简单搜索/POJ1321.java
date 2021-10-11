package algorithm.kuangbing_program.¼òµ¥ËÑË÷;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class POJ1321 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static final int N = 10;
    static char[][] g = new char[N][N];
    static boolean[] col = new boolean[N];
    static int ans, n, k;

    public static void main(String[] args) throws IOException {
        while (true) {
            n = nextInt();
            k = nextInt();
            if (n == -1 && k == -1) break;
            for (int i = 0; i < n; i++) {
                g[i] = in.readLine().toCharArray();
            }
            ans = 0;
            dfs(0, 0);
            out.println(ans);
        }

        out.flush();
        out.close();
    }

    private static void dfs(int row, int cnt) {
        if (row > n) {
            if (cnt == k) ans++;
            return;
        }
        for (int i = 0; i < n; i++) {
        if (g[row][i] == '#' && !col[i]) {
                col[i] = true;
                dfs(row + 1, cnt + 1);
                col[i] = false;
            }
        }
        dfs(row + 1, cnt);
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

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
