package niukecontest.牛客2021年儿童节比赛;

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
        String s1 = next();
        int x = 0, y = 0;
        for (int i = 0; i < s1.length() - 1; i++) {
            if (s1.charAt(i) == 'n') x++;
            if (s1.charAt(i) == 'y' && s1.charAt(i + 1) == 'a') y++;
        }
        x += s1.charAt(s1.length() - 1) == 'n' ? 1 : 0;
        int k = nextInt();
        String s2 = next();
        long ans = s1.length();
        for (int i = 0; i < k; i++) {
            if (s2.charAt(i) == 'N') {
                ans += x * 2;
                y += x;
            } else {
                ans -= y;
                x += y;
            }
        }
        out.println(ans % 1000000007);
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
