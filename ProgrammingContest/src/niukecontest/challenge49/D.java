package niukecontest.challenge49;

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
        String a = next();
        String b = next();

        out.flush();
        out.close();
    }

    private static boolean judge(String s) {
        int mid = s.length() >> 1;
        for (int i = 0, j = s.length() - 1; i <= mid; i++) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }

    private static int kmpSearch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        if (sLen < pLen) {
            return -1;
        }

        int[] next = getNext(p);
        int i = 0, j = 0;
        while (i < sLen && j < pLen) {
            if (j == -1 || s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == pLen) {
            return i - j;
        } else {
            return -1;
        }
    }

    private static int[] getNext(String p) {
        int len = p.length();
        int[] next = new int[len];
        next[0] = -1;
        int i = 0, k = -1;
        while (i < len - 1) {
            if (k == -1 || p.charAt(i) == p.charAt(k)) {
                ++k;
                ++i;
                next[i] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }


    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(in.readLine());
        }
        return tokenizer.nextToken();
    }
}
