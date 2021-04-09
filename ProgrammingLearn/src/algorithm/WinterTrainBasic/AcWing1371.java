package algorithm.WinterTrainBasic;

import java.util.Scanner;

/*3 10
        1 2 5*/
public class AcWing1371 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
           arr[i] = scanner.nextInt();
        }
        scanner.close();
        int[] dp = new int[m + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m ; j++) {
                dp[j] = dp[j] + dp[j - arr[i]];
            }
        }
        System.out.println(dp[m]);
    }
}
