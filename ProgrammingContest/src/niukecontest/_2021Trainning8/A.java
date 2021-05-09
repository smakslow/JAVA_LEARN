package niukecontest._2021Trainning8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int N = 1010;
    static int[] arr = new int[N];

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        arr[0] = arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                boolean f = true;
                for (int k = 1; 2 * k <= i; k++) {
                    if (j - arr[i - k] == arr[i - k] - arr[i - 2 * k]) {
                        f = false;
                        break;
                    }
                }
                if (f) {
                    arr[i] = j;
                    break;
                }
            }
        }
        out.println(arr[n]);
        in.close();
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
