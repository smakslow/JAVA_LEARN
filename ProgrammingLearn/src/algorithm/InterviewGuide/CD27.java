package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3 3
        -90 48 78
        64 -40 64
        -81 -7 66*/
public class CD27 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int row = Integer.parseInt(str[0]);
        int col = Integer.parseInt(str[1]);
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            str = reader.readLine().split(" ");
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(str[i]);
            }
        }
        System.out.println(solution(arr,row,col));
    }

    private static int solution(int[][] arr, int row, int col) {
        int res = 0;
        int[][] dp = new int[row + 1][col + 1];
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= col; j++) {
                  dp[i][j] = Math.max(dp[i - 1][j] + arr[i - 1][j - 1],dp[i][j] + arr[i - 1][j -1]);
                  res = Math.max(dp[i][j],res);
            }
        }
        return  res;
    }
}
