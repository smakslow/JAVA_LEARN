package acwing.weeklycontest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");


    public static void main(String[] args) throws IOException {
        int n = nextInt();
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        int i = 0, j = 0;
        while (n-- > 0) {
            String s = next();
            int t = nextInt();
            if (s.equals("R")) {
                right.put(t, ++j);
            } else if (s.equals("L")) {
                left.put(t, ++i);
            } else {
                int res;
                if (left.containsKey(t)) {
                    res = Math.min(left.size() - left.get(t), right.size() + left.get(t) - 1);
                } else {
                    res = Math.min(right.size() - right.get(t), left.size() + right.get(t) - 1);
                }
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
}
