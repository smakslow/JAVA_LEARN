package learn.chart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NC16649 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int[] del = new int[10010];

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int m = nextInt();
        del[0] = 1;
        for (int i = 0; i < m; i++) {
            int left = nextInt();
            int right = nextInt();
            del[left]--;
            del[right + 1]++;
        }
        int res = 0;
        if (del[0] > 0) res++;
        for (int i = 1; i <= n; i++) {
            del[i] += del[i - 1];
            if (del[i] > 0) res++;
        }
        out.println(res);
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
