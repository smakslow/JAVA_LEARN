package niukecontest.shanghaiuniver19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int N = 100010;
    static long[][] arr = new long[N][N];
    static int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        int T = nextInt();
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                arr[i][j] += arr[i - 1][j - 1] + i * j;
            }
        }
        while (T-- > 0) {
            next();
            int x1 = nextInt();
            int y1 = nextInt();
            int x2 = nextInt();
            int y2 = nextInt();
            out.println((arr[x2][y2] - arr[x1 - 1][y1 - 1]) % MOD);
        }
        out.flush();
        out.close();
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
