package noobdream.xiaobai_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class K {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        int T = nextInt();
        while (T-- > 0) {
            int a = nextInt();
            int b = nextInt();
            int c = nextInt();
            if (a + b > c && a + c > b && b + c > a) {
                if (a == b && b == c)
                    out.println("perfect");
                else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
                    out.println("good");
                else
                    out.println("bad");
            } else
                out.println("bad");
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
