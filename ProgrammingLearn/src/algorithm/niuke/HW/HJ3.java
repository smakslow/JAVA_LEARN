package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class HJ3 {
    static PrintWriter out = new PrintWriter(System.out);
    static  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String str;
        int n;
        int[] arr;
        while ((str = reader.readLine()) != null) {
            n = Integer.parseInt(str);
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                str = reader.readLine();
                arr[i] = Integer.parseInt(str);
            }
            Arrays.sort(arr);
            int i = 0;
            for (int j = 1; j < n; j++) {
                if (arr[j] != arr[i]) {
                    i++;
                    arr[i] = arr[j];
                }
            }
            for (int j = 0; j < i + 1; j++) {
                out.println(arr[j]);
            }
        }
        reader.close();
        out.flush();
        out.close();
    }
}
