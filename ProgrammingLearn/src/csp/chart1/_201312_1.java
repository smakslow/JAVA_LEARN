package csp.chart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _201312_1 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");


    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nextInt();
        for (int i = 0; i < n; i++) {
            int a = nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int ans = 0;
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            } else if (entry.getValue() == max) {
                if (entry.getKey() < ans) ans = entry.getKey();
            }
        }
        out.println(ans);
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
