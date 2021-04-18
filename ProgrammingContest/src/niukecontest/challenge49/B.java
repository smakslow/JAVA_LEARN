package niukecontest.challenge49;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        long n = nextLong();
        String next = String.valueOf(n);
        long res = 0;

        out.println(Math.abs(res));
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

    static Long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}
