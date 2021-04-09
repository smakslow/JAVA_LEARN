package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD45 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            str = reader.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        reader.close();
        System.out.println(solution(arr, n, m));
    }

    private static int solution(int[][] arr, int n, int m) {
        // 记录从每个位置出发，到达目的地，骑士初始至少要有多少血。
        int[][] dp = new int[n][m];
        // 先处理目的地
        if (arr[n - 1][m - 1] <= 0){
            dp[n - 1][m - 1] = 1 - arr[n - 1][m - 1];
        } else {
            dp[n - 1][m - 1] = 1;
        }

        // 处理最后一行
        for (int j = m - 2; j >= 0; --j) {
            if (dp[n - 1][j + 1] - arr[n - 1][j] > 0){
                dp[n - 1][j] = dp[n - 1][j + 1] - arr[n - 1][j];
            } else {
                dp[n - 1][j] = 1;
            }
        }
        // 处理最后一列
        for (int i = n-2; i >= 0; --i) {
            if (dp[i + 1][m-1] - arr[i][m-1] > 0) {
                dp[i][m - 1] = dp[i + 1][m-1] - arr[i][m-1];
            } else {
                dp[i][m - 1] = 1;
            }
        }
        // 从后往前处理剩余位置
        for (int i = n - 2; i >= 0; --i) {
            for (int j = m - 2; j >= 0; --j) {
                // 往右走需要多少血
                int toLeft = dp[i][j + 1] - arr[i][j] > 0 ? dp[i][j + 1] - arr[i][j] : 1;
                // 往下走需要多少血
                int toDown = dp[i + 1][j] - arr[i][j] > 0 ? dp[i + 1][j] - arr[i][j] : 1;
                dp[i][j] = toLeft > toDown ? toDown : toLeft;
            }
        }
        return dp[0][0];
    }
}
