package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1007 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n + 1];
        String[] str = reader.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(str[i - 1]);
        }
        solution(arr, n);
    }

    private static void solution(int[] arr, int n) {
        int[] dp = new int[n + 1];
        int res = 0;
        int left = 0, right = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] > 0) {
                dp[i] = dp[i - 1] + arr[i];
            } else {
                dp[i] = 0;
            }
            res = Math.max(res, dp[i]);
        }
        System.out.println(res + " " + left + " " + right);
    }
}
