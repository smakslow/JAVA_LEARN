package niukecontest.practice83;

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
        int T = nextInt();
        while (T-- > 0) {
            int n = nextInt();
            boolean flag = false;
            int beginX = 0, beginY = 0;
            for (int i = 0; i < n; i++) {
                int t, x, y;
                t = nextInt();
                x = nextInt();
                y = nextInt();
                int a = Math.abs(x - beginX) + Math.abs(y - beginY);
                if(a <= t && (a == 0 ||  t % a == 0) ) flag = true;
                beginX = x;
                beginY = y;
            }
            if(flag) System.out.println("Yes");
            else System.out.println("No");
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
