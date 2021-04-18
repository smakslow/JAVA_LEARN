package noobdream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class _1414 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str;
        while ((str = in.readLine()) != null) {
            out.println(judge(str) ? "Yes!" : "No!");
        }

        out.flush();
        out.close();
    }

    private static boolean judge(String str) {
        int n = str.length();
        int m = n >> 1;
        for (int i = 0, j = n - 1; i <= m; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }

}
