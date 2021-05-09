package noobdream.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class _1051 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) throws IOException {
         String str;
         while((str = in.readLine()) != null){
             String[] s = str.split(" ");
             int year = Integer.parseInt(s[0]);
             int month = Integer.parseInt(s[1]);
             int day = Integer.parseInt(s[2]);
             if((year % 400 == 0) || (year % 4 == 0 && year % 100  != 0)) days[2]++;
             else days[2] = 28;
             boolean flag = false;
             if(month < 1 || month > 12) flag = true;
             if(day <= 0  || (!flag && day > days[month]) ) flag = true;
             if(flag){
                 out.println("Input error!");
                 continue;
             }
             int ans = day;
             for (int i = 0; i < month; i++) {
                 ans += days[i];
             }
             out.println(ans);
         }
        out.println();
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
