package algorithm.AcWing;

import java.util.Scanner;

public class AcWing126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] dp = new int[n + 1][n + 1];
        while (scanner.hasNextInt()) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = dp[i - 1][j] + scanner.nextInt();
                }
            }
        }
        int res = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int f = 0;
                for (int k = 1; k < n; k++) {
                    int w = dp[j][k] - dp[i - 1][k];
                    f = Math.max(f, 0) + w;
                    res = Math.max(res, f);
                }
            }
        }
        System.out.println(res);
    }
}
