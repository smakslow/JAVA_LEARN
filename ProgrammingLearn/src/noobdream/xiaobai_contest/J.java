package noobdream.xiaobai_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class J {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        int T = nextInt();
        while (T-- > 0) {
            int n = nextInt();
            int a = 0;
            int b = 0;
            while (n > 0) {
                if(n % 2==0){
                    a++;
                }else{
                    b++;
                }
                n >>= 1;
            }
            if(b == 0){
                out.println(0);
            }else{
                out.print(1);
                for (int i = 0; i < a; i++) {
                    out.print(0);
                }
                out.println();
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

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
