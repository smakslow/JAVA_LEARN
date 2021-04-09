package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*1000 5
        800 2
        400 5
        300 5
        400 3
        200 2*/
public class AcWing426 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= m; i++) {
            str = reader.readLine().split(" ");
            int v = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
            w = v * w;
            for (int j = 0; j <= n ; j++) {
                dp[i][j] = dp[i -1][j];
                if(j >= v){
                    dp[i][j] = Math.max(dp[i][j],dp[i - 1][j -v] + w);
                }
            }
        }
        reader.close();
        System.out.println(dp[n][m]);
    }
}
