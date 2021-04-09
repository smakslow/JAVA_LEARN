package niukecontest.xinankeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class K {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int[] A = new int[10010];
    static int[] B = new int[10010];

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int q = nextInt();
        for (int i = 0; i < n; i++) {
            A[i] = nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = nextInt();
        }
        int res = 0;
        for (int i = 0; i < q; i++) {
            int x = nextInt();
            int y = nextInt();
            boolean flag = x > y;
            for (int j = 0; j < n; j++) {
                if(flag) {
                    res++;
                    if (x + A[i] <= y + B[i]) {
                            out.print(res);
                            break;
                    }
                }else {
                    res++;
                    if (x + A[i] >= y + B[i]) {
                        out.print(res);
                        break;
                    }
                }
            }
            out.println(-1);
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



