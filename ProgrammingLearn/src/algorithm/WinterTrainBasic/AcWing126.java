package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing126 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int row, col;
        int[][] arr;
        String[] str;
        while (n-- > 0) {
            str = reader.readLine().split(" ");
            row = Integer.parseInt(str[0]);
            col = Integer.parseInt(str[1]);
            arr = new int[row][col];
            for (int i = 0; i < row; i++) {
                str = reader.readLine().split(" ");
                for (int j = 0; j < col; j++) {
                    arr[i][j] = Integer.parseInt(str[i]);
                }
            }
            System.out.println(solution(arr,row,col));
        }
        reader.close();
    }

    private static int solution(int[][] arr, int row, int col) {
        int[][] dp = new int[row + 1][col + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                dp[i][j] = Math.max(dp[i - 1][j] + arr[i - 1][j -1], dp[i][j - 1] + arr[i - 1][j -1]);
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[row][col];
    }
}
