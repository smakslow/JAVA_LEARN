package niukecontest.practice80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class A {

    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        String str = next();
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < str.length();) {
            int j = i;
            while(j < str.length() &&  str.charAt(j) == '1' && str.charAt(j) == str.charAt(j  + 1) ) j++;
           if(i != j){
               ans.add(new int[]{i,j});
               i = j;
           }else {
               i++;
           }
        }
        int res = ans.size();
        for (int i = 1; i < res; i++) {
            if(ans.get(i)[0] - ans.get(i - 1)[1] == 1){
                out.println(res - 1);
                return;
            }
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
