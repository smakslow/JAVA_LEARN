package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HJ53 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        String str;
        while((str = reader.readLine()) != null){
            int n = Integer.parseInt(str);
            if(n == 1 || n == 2) out.println(-1);
            else if (n % 4 == 1 || n % 4 == 3) out.println(2);
            else if (n % 4 == 0) out.println(3);
            else if (n % 4 == 2) out.println(4);
        }
        out.flush();
        out.close();
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}
