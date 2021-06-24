package acwing.weeklycontest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        long k = nextLong();
        System.out.println(Integer.bitCount());
        out.println(dfs(n, k));
        out.flush();
        out.close();
    }

    private static long dfs(int n, long k) {
        if (k == 1L << n - 1) return n;
        if (k < 1L << n - 1) return dfs(n - 1, k);
        return dfs(n - 1, k - (1L << n - 1));
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

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}
