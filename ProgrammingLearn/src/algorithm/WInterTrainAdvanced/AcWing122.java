package algorithm.WInterTrainAdvanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AcWing122 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        long[] s = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            s[i] = Long.parseLong(reader.readLine());
            s[i] += s[i -1];
        }
        reader.close();
        long ave = s[n]/ n;
        int k = 0;
        long[] c = new long[n];
        for (int i = 1; i < n; i++) {
             c[k++] = ave * i - s[i];
        }
        c[k++] = 0;
        Arrays.sort(c);
        long mid = c[n >> 1];
        long res = 0;
        for (int i = 0; i < k; i++) {
            res += Math.abs(c[i] - mid);
        }
        System.out.println(res);
    }
}
