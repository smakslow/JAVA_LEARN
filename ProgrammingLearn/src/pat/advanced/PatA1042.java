package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1042 {
    static int[] arr = new int[55];
    static int[] res = new int[55];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        for (int i = 1; i <= 54; i++) {
            arr[i] = Integer.parseInt(str[i - 1]);
        }
        for (int i = 0; i < k; i++) {
           res[arr[i]] = arr[i];
        }
    }
}
