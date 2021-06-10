package acwing.weeklycontest2;

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
            int a = n / 3;
            int b = n / 5;
            int c = n / 7;
            boolean flag = false;
            for (int i = 0; i <= a; i++) {
                for (int j = 0; j <= b; j++) {
                    for (int k = 0; k <= c; k++) {
                        if (3 * i + 5 * j + 7 * k == n) {
                            out.println(i + " " + j + " " + k);
                            flag = true;
                            break;
                        }
                    }
                    if(flag) break;
                }
                if(flag) break;
            }
            if(!flag) out.println(-1);
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
