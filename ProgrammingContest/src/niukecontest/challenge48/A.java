package niukecontest.challenge48;

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
        int n = nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = nextInt();
        }
        int[] dp = new int[n + 1];
        dp[1] = arr[1];
        int max = dp[1];
        for (int i = 2; i <= n; i++) {
            if (arr[i] >= max) {
                dp[i] = max;
                max = arr[i];
            } else {
                if(arr[i] < dp[i - 1]){
                    dp[i] = dp[i - 1];
                }else{
                    dp[i] = arr[i];
                }
            }
        }
        int q = nextInt();
        for (int i = 0; i < q; i++) {
            int t = nextInt();
            System.out.println(dp[t]);
        }
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
