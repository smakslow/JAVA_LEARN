package noobdream.xiaobai_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class I {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int[] arr = new int[1010];

    public static void main(String[] args) throws IOException {
        String str = next();
        for (int i = 0; i < str.length(); i++) {
            arr[i + 1] = arr[i] + str.charAt(i);
        }

        int q = nextInt();
        for (int i = 0; i < q; i++) {
            int left = nextInt();
            int right = nextInt();
            out.println(arr[right] - arr[left - 1]);
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
