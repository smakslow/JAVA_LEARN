package niukecontest._2021Trainning4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class D {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        if (isHappy(nextInt())) {
            out.println("HAPPY");
        } else {
            out.println("UNHAPPY");
        }
        out.flush();
        out.close();
    }

    private static boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while (n != 1) {
            n = getbow(n);
            System.out.println(n);
            if (hashSet.contains(n)) {
                return false;
            }
            hashSet.add(n);
        }
        return true;
    }

    private static int getbow(int n) {
        int num = 0;
        while (n != 0) {
            num += Math.pow((n % 10), 2);
            n /= 10;
        }
        return num;
    }


    private static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(in.readLine());
        }
        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
