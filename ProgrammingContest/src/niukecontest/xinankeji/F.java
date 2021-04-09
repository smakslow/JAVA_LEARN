package niukecontest.xinankeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class F {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int mod = 998244353;
    static BigInteger[] arr = new BigInteger[1000010];
    static BigInteger M = new BigInteger("998244353");

    public static void main(String[] args) throws IOException {
        int T = nextInt();
        arr[0] = new BigInteger("0");
        for (int i = 1; i <= 1000000; i++) {
            BigInteger a1 = new BigInteger(String.valueOf((i << 1) - 1));
            BigInteger a2 = new BigInteger(String.valueOf(i));
            BigInteger temp = a1.multiply(a2);
            BigInteger mod = temp.mod(M);
            arr[i] = arr[i - 1].add(mod);
            arr[i] = arr[i].mod(M);
        }
        while (T-- > 0) {
            out.println(arr[nextInt()]);
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


