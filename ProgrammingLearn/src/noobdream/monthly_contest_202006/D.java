package noobdream.monthly_contest_202006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class D {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        String source = next();
        int n = nextInt();
        for (int i = 0; i < n; i++) {
            int a = nextInt();
            int b = nextInt();
            int c = nextInt();
            int d = nextInt();
            if(a < c && b >= c) {
                int temp = b;
                b = c;
                c = temp;
            }else if(c < a && d >= a) {
                int temp = a;
                a = d;
                d = temp;
            }

            if((a - b) != (c - d)) {
                out.println("NE");
                continue;
            }
            int[] chars = new int[26];
            for (int j = a - 1; j < b; j++) {
                chars[source.charAt(j) - 'a']++;
            }
            for (int j = c - 1; j < d; j++) {
                chars[source.charAt(j) - 'a']--;
            }
            boolean ans = true;
            for (int aChar : chars) {
                if (aChar != 0) {
                    ans = false;
                    break;
                }
            }
            if (ans) out.println("DA");
            else out.println("NE");
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
