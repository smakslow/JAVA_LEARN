package niukecontest.practice80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class A {

    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        String str = " " + next() + " ";
        int n = str.length() - 2;
        char[] ch = str.toCharArray();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (ch[i] == '0') continue;
            int j = i;
            while (ch[j] == '1') j++;
            i = j - 1;
            cnt++;
        }
        int A = cnt;
        for (int i = 1; i <= n; i++)
            if (ch[i] == '1' && ch[i - 1] != '1' && ch[i + 1] != '1')
                A = cnt - 1;
        int B = cnt;
        for (int i = 2; i < n; i++)
            if (ch[i] != '1' && ch[i - 1] == '1' && ch[i + 1] == '1')
                B = cnt - 1;
        out.println(Math.min(cnt, Math.min(A, B)));
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
