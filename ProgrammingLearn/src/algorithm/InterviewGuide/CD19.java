package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD19 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int amount = Integer.parseInt(str[1]);
        int[] arr = new int[n];
        str = reader.readLine().split(" ");
        reader.close();
        System.out.println(solution(arr,n,amount));
    }

    private static int solution(int[] arr, int n, int amount) {
        int[] dp = new int[n];
    return  dp[n - 1];
    }
}
