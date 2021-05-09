package noobdream.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class _1062 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str;
        int n;
        while ((str = in.readLine()) != null) {
            n = Integer.parseInt(str);
            if (n <= 0) break;
            int[][] arr = new int[n + 1][n + 1];
            arr[1][1] = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i][j - 1];
                }
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                  out.print(arr[i][j] + " ");
                }
                out.println();
            }
        }
        out.println();
        out.flush();
        out.close();
    }
}
