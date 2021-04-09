package niukecontest.gdut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int N = 1000_001;
     static int[] arr = new int[N];
    public static void main(String[] args) throws IOException {
         int n = nextInt();
        for (int i = 1; i <= n; i++) {
            arr[i] = nextInt();
        }
        int res = 0;
        for (int i = 1; i <= n ; i++) {
            int j = i;
            while(j <= n){
                if(arr[j] >= arr[i]) j++;
            }
            res = Math.max(res,j - i);
        }
        out.println(res);

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
