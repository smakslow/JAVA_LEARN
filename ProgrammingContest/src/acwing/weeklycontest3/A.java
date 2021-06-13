package acwing.weeklycontest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        int T = nextInt();
        int n, m, r, c;
        while (T-- > 0) {
            n = nextInt();
            m = nextInt();
            r = nextInt();
            c = nextInt();
            solve(n, m, r, c);
        }
        out.flush();
        out.close();
    }

    private static void solve(int n, int m, int r, int c) {
        int ans = 0;
        ans = Math.max(Math.abs(r - 1) + Math.abs(c - 1), ans);
        ans = Math.max(Math.abs(r - n) + Math.abs(c - m), ans);
        ans = Math.max(Math.abs(r - 1) + Math.abs(c - m), ans);
        ans = Math.max(Math.abs(r - n) + Math.abs(c - 1), ans);

        out.println(ans);
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
