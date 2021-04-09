package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing754 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        while ((str = reader.readLine()) != null) {
            n = Integer.parseInt(str);
            if (n == 0) break;
            solution(n);
        }
        reader.close();
    }

    private static void solution(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i, k = 1; j < n; j++,k++) {
                  arr[i][j] = k;
                  arr[j][i] = k;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
