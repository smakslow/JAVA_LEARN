package algorithm.AcWing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class AcWing3267 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        int r = nextInt();
        int y = nextInt();
        int g = nextInt();
        int n = nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int k = nextInt();
            int t = nextInt();
            if (k == 0) res += t;
            else if (k == 1) res += t;
            else if (k == 2) res += t + r;
        }
        System.out.println(res);
    }

    private static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(in.readLine());
        }
        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}
