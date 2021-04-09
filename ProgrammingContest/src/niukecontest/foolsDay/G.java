package niukecontest.foolsDay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class G {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int mod = 1000_000_007;
    static String M = "1000000007";

    public static void main(String[] args) throws IOException {
        long n = nextLong();
        out.println(n % mod);
        out.println((((n % mod) << 1) - 1) % mod);
        out.println(((n % mod) * (n % mod)) % mod);
        out.println(compute(2, n - 1));//
        out.println(compute(2, compute(2, n - 1)));
        out.println(n % 2 == 1 ? 1 : 2);
        out.println(compute(n));
        out.flush();
        out.close();
    }

    private static long compute(long a, long b) {
        long res = 1 % mod;
        while (b != 0) {
            if ((b & 1) != 0) res = res * a % mod;
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }

    private static BigInteger compute(long n) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append("1");
        }
        BigInteger b = new BigInteger(str.toString());

        return b.mod(new BigInteger(M));
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

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
