package niukecontest.xinankeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B {
    static final int mod = 100_000_007;
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        int base = nextInt();
        int p = nextInt();
        int n = nextInt();
        String str = next();
        long target = gethash(str,base,p);
        char[] chars = new char[n];
        for (int i = 0; i < 26; i++) {

        }
        out.flush();
        out.close();
    }

    static long gethash(String s, int base, int p) {
        long hashsum = 0;
        for (int i = 0; i < s.length(); i++)
            hashsum = (hashsum * base + s.charAt(i) - 'a') % p;
        return hashsum;
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


