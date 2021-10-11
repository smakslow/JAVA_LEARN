package algorithm.kuangbing_program.¼òµ¥ËÑË÷;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class POJ3984 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int N = 5;
    static int[][] arr = new int[N][N];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = nextInt();
            }
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
