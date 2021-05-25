package acwing.weeklycontest1;

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

        while (true) {
            int a = 0;
            int t = n;
            while (t > 0) {
                a += t % 10;
                t /= 10;
            }
            if ((a % 4) == 0) {
                out.println(n);
                break;
            } else n++;
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
