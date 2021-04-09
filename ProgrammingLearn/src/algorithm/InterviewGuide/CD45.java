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
        // ��¼��ÿ��λ�ó���������Ŀ�ĵأ���ʿ��ʼ����Ҫ�ж���Ѫ��
        int[][] dp = new int[n][m];
        // �ȴ���Ŀ�ĵ�
        if (arr[n - 1][m - 1] <= 0){
            dp[n - 1][m - 1] = 1 - arr[n - 1][m - 1];
        } else {
            dp[n - 1][m - 1] = 1;
        }

        // �������һ��
        for (int j = m - 2; j >= 0; --j) {
            if (dp[n - 1][j + 1] - arr[n - 1][j] > 0){
                dp[n - 1][j] = dp[n - 1][j + 1] - arr[n - 1][j];
            } else {
                dp[n - 1][j] = 1;
            }
        }
        // �������һ��
        for (int i = n-2; i >= 0; --i) {
            if (dp[i + 1][m-1] - arr[i][m-1] > 0) {
                dp[i][m - 1] = dp[i + 1][m-1] - arr[i][m-1];
            } else {
                dp[i][m - 1] = 1;
            }
        }
        // �Ӻ���ǰ����ʣ��λ��
        for (int i = n - 2; i >= 0; --i) {
            for (int j = m - 2; j >= 0; --j) {
                // ��������Ҫ����Ѫ
                int toLeft = dp[i][j + 1] - arr[i][j] > 0 ? dp[i][j + 1] - arr[i][j] : 1;
                // ��������Ҫ����Ѫ
                int toDown = dp[i + 1][j] - arr[i][j] > 0 ? dp[i + 1][j] - arr[i][j] : 1;
                dp[i][j] = toLeft > toDown ? toDown : toLeft;
            }
        }
        return dp[0][0];
    }
}
