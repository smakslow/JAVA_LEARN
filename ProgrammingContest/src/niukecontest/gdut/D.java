package niukecontest.gdut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class D {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static BigInteger mod = new BigInteger("1000000007");

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int q = nextInt();
        LinkedList<BigInteger> str = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            str.add(new BigInteger(next()));
        }
        for (int i = 0; i < q; i++) {
            int flag = nextInt();
            String temp = next();
            switch (flag) {
                case 1:
                    for (int j = 0; j < str.size(); j++) {
                        str.set(j, str.get(j).multiply(new BigInteger(temp)));
                    }
                    break;
                case 2:
                    for (int j = 0; j < str.size(); j++) {
                        str.set(j, str.get(j).add(new BigInteger(temp)));
                    }
                    break;
                case 3:
                    str.addFirst(new BigInteger(temp));
                    break;
                case 4:
                    str.add(new BigInteger(temp));
                    break;
                case 5:
                    out.println(str.get(Integer.parseInt(temp) - 1).mod(mod));
                    break;
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
}

