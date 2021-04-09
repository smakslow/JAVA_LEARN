package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class AcWing703 {
    private static boolean[] flag;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());//²âÊÔ×éÊý
        int N, M;
        int[][] arr;
        String[] str;
        for (int i = 1; i <= T; i++) {
            N = Integer.parseInt(reader.readLine());
            M = N * N;
            arr = new int[M][M];
            flag = new boolean[M + 1];
            for (int j = 0; j < M; j++) {
                str = reader.readLine().split(" ");
                for (int k = 0; k < M; k++) {
                    arr[j][k] = Integer.parseInt(str[k]);
                }
            }
            if (judgeCol(arr, M) && judgeRow(arr, M) && judgeMatrix(arr, N, M)) {
                System.out.println("Case #" + i + ": Yes");
            } else {
                System.out.println("Case #" + i + ": No");
            }
        }
        reader.close();
    }

    private static boolean judgeRow(int[][] arr, int M) {
        for (int i = 0; i < M; i++) {
            Arrays.fill(flag, false);
            for (int j = 0; j < M; j++) {
                int t = arr[i][j];
                if (t < 1 || t > M || flag[t]) return false;
                flag[t] = true;
            }
        }
        return true;
    }

    private static boolean judgeCol(int[][] arr, int M) {
        for (int i = 0; i < M; i++) {
            Arrays.fill(flag, false);
            for (int j = 0; j < M; j++) {
                int t = arr[j][i];
                if (t < 1 || t > M || flag[t]) return false;
                flag[t] = true;
            }
        }
        return true;
    }

    private static boolean judgeMatrix(int[][] arr, int N, int M) {
        for (int i = 0; i < M; i += N) {
            for (int j = 0; j < M; j += N) {
                Arrays.fill(flag, false);
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        int t = arr[i + k][j + l];
                        if (t < 1 || t > M || flag[t]) return false;
                        flag[t] = true;
                    }
                }
            }
        }
        return true;
    }
}
