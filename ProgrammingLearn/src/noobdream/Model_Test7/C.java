package noobdream.Model_Test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        String str;
        while ((str = in.readLine()) != null) {
            String[] s = str.split(" ");
            String a = in.readLine();
            String b  = in.readLine();
            StringBuilder sb =  new StringBuilder();
            for (int i = 0; i < s.length; i++) {
                if(s[i].equals(a)){
                    sb.append(b).append(" ");
                }else{
                    sb.append(s[i]).append(" ");
                }
            }
            out.println(sb);
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
