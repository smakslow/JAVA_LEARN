package pat.basic;

// write your code here
import java.io.*;

public class Main{
    static int total = 1000000;
    public static void main(String[] args) throws IOException{
        int[] dp = dp(total);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        while((str = reader.readLine()) != null){
            n = str.charAt(0) - '0';
            if(dp[n] % 3 != 0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
    private static int[] dp(int n){
        int[] dp = new int[n + 1];
        dp[0] = 7;
        dp[1] = 11;
        for(int i = 2; i <= n;i ++){
            dp[i] = dp[i-1] + dp[i - 2];
        }
        return dp;
    }
}
