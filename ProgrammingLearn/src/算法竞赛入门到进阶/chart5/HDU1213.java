package 算法竞赛入门到进阶.chart5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HDU1213 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int maxn = 1050;
    static int[] arr = new int[maxn + 1];

    public static void main(String[] args) throws IOException {
        int t, n, m, x, y;
        t = nextInt();
        while (t-- > 0) {
            n = nextInt();
            m = nextInt();
            init();
            for (int i = 1; i <= m; i++) {
                x = nextInt();
                y = nextInt();
                union(x, y);
            }
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                if (arr[i] == i) ans++;
            }
            out.println(ans);
        }
        out.flush();
        out.close();
    }

    static void init() {
        for (int i = 1; i <= maxn; i++) {
            arr[i] = i;
        }
    }

    static int find(int x) {
        return x == arr[x] ? x : find(arr[x]);
    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) arr[x] = arr[y];
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
