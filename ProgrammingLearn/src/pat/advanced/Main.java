package pat.advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] scores = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            scores[i] = Integer.parseInt(strArr[i]);
            sum += scores[i];
        }
        int[] dp = new int[20001];    // 1~100个1~200的数总和最大为20000
        // 求解背包问题
        dp[0] = 1;
        dp[sum] = 1;
        for(int i = 0; i < n; i++){
            dp[scores[i]] = 1;
            for(int j = 0; j <= sum; j++){
                if(dp[j] == 1 && j - scores[i] >= 0)
                    dp[j - scores[i]] = 1;
            }
        }
        // 降序依次检测分数是否符合不含5
        for(int score = sum; score >= 0; score--){
            if(dp[score] == 1 && !String.valueOf(score).contains("5")){
                System.out.println(score);
                break;
            }
        }
    }
}
