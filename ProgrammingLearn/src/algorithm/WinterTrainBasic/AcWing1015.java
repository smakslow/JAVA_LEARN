package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*2
        2 2
        1 1
        3 4
        2 3
        2 3 4
        1 6 5*/
public class AcWing1015 {
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        String[] str;
        while (T-- > 0) {
            str = reader.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                str = reader.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(str[j]);
                }
            }
            System.out.println(solution(n, m));
        }
        reader.close();
    }

    private static int solution(int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j] + arr[i - 1][j - 1], dp[i][j - 1] + arr[i - 1][j - 1]);
            }
        }
        return dp[n][m];
    }

}
