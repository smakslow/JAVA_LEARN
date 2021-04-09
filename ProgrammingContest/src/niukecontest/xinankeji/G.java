package niukecontest.xinankeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class G {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int N = 1000_000_010;
    static int[][] arr = new int[N][N];

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int k = nextInt();
        int q = nextInt();

        for (int i = 1; i <= n; i++) {
            int temp = n - 2 * (i - 1);
            for (int j = i; j <= temp; j++) {

            }
            k += k;
        }
        while (q-- > 0) {
            int x = nextInt();
            int y = nextInt();
            System.out.println(arr[x][y]);
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


