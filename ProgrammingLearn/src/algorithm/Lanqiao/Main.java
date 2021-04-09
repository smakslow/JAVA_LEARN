package algorithm.Lanqiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static int minCoin(int[] arr, int aim){
        if(arr == null || arr.length == 0 || aim <= 0)
            return -1;
        int[] dp = new int[aim+1];
        for(int j = 1; j <= aim; j++){
            dp[j] = -1;
        }
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = arr[i]; j <= aim; j++){
                if(dp[j-arr[i]] != -1){
                    if(dp[j] != -1){
                        dp[j] = Math.min(dp[j], dp[j-arr[i]] + 1);
                    }else{
                        dp[j] = dp[j - arr[i]] + 1;
                    }
                }
            }
        }
        return dp[aim];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ops = br.readLine().split(" ");
        int n = Integer.parseInt(ops[0]);
        int aim = Integer.parseInt(ops[1]);
        ops = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(ops[i]);
        }
        //Arrays.sort(arr);
        System.out.println(minCoin(arr, aim));
    }
}
