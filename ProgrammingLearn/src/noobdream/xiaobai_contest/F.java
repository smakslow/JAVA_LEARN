package noobdream.xiaobai_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class F {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int MOD = (int) 1e9;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int ans = n;
        int pre = 0;
        while (!map.isEmpty()) {
            int first = map.firstKey();
            int value = map.get(first);
            pre += value;
            ans += (value * (n - pre) % MOD);
            ans %= MOD;
            map.remove(first);
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
