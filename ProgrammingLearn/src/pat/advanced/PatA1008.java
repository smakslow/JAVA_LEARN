package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i + 1]);
        }
        int start = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > start) {
                res += (arr[i] - start) * 6;
            } else {
                res += (start - arr[i]) * 4;
            }
            res += 5;
            start = arr[i];
        }
        System.out.println(res);
    }
}
