package niuke_recruit.pdd2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        if (n > 45) {
            System.out.println(-1);
            return;
        }
        int ans = 0, max = 9, level = 1;
        while (n > 0) {
            if (n > max) {
                ans += max * level;
                level *= 10;
            } else ans += n * level;
            n -= max;
            max--;
        }
        System.out.println(ans);
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
}
