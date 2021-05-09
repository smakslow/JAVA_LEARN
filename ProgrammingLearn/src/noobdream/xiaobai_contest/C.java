package noobdream.xiaobai_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class C {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int MOD = 200907;

    public static void main(String[] args) throws IOException {
        int T = nextInt();
        while (T-- > 0) {
            long a = nextLong();
            long b = nextLong();
            long c = nextLong();
            long n = nextLong();
            if ((c - b) == (b - a)) {
                long d = c - b;
                out.println(((a % MOD) + ((n - 1) * d % MOD)) % MOD);
            } else {
                long q = c / b;
                BigInteger aBig = new BigInteger(String.valueOf(a));
                BigInteger qBig = new BigInteger(String.valueOf(q));
                BigInteger res = qBig.pow((int) (n - 1)).multiply(aBig).mod(new BigInteger(String.valueOf(MOD)));
                out.println(res);
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

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}
