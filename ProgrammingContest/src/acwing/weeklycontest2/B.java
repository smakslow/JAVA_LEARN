package acwing.weeklycontest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int max = 200010;
    static Integer[] arr = new Integer[max];

    public static void main(String[] args) throws IOException {
        int T, n, k;
        T = nextInt();
        while (T-- > 0) {
            n = nextInt();
            k = nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            Arrays.sort(arr, 0, n, ((o1, o2) -> o2 - o1));
            long ans = 0;
            for (int i = 0; i <= k; i++) {
                ans += arr[i];
            }
            out.println(ans);
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
