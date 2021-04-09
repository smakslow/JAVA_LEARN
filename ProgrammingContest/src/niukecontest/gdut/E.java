package niukecontest.gdut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class E {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int[] arr = new int[100010];

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int q = nextInt();
        for (int i = 1; i <= n; i++) {
            arr[i] = nextInt();
        }
        for (int i = 0; i < q; i++) {
            int left = nextInt();
            int right = nextInt();
            int target = nextInt();
            int res = 0;
            for (int j = left; j <= right; j++) {
                if (arr[j] % target == 0) {
                    res++;
                }
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
