package learn.chart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NC15553 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int[] sum = new int[2000010];

    public static void main(String[] args) throws IOException {
        int T = nextInt();
        while (T-- > 0) {
            int n = nextInt();
            int k = nextInt();
            for (int i = 1; i <= n; i++) {
                sum[i] = nextInt();
                sum[i] += sum[i - 1];
            }
            long[] dp = new long[n + 1];    // dp1[i]第i个元素（包含）之前最大连续k和
            long maxV = Long.MIN_VALUE;
            for (int i = k; i <= n; ++i) {
                long curr = sum[i] - sum[i - k];
                maxV = Math.max(maxV, curr);
                dp[i] = maxV;
            }
            long res = Long.MIN_VALUE;
            for (int i = k; i <= n - k; ++i) {
                res = Math.max(res, dp[i] + sum[i + k] - sum[i]);//每次加上第i个之前的最大连续k和
            }
            out.println(res);
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
