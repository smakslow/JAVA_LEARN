package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ44 {
    static int[][] arr = new int[9][9];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str;
        for (int i = 0; i < 9; i++) {
            str = reader.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        dfs(0,0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static boolean dfs(int i, int j) {
        // (9,0)坐标
        if (i == 9) {
            return true;
        }
        if (arr[i][j] == 0) {
            for (int k = 1; k <= 9; k++) {
                arr[i][j] = k;
                if (check(i, j) && dfs(j == 8 ? i + 1 : i, j == 8 ? 0 : j + 1)) {
                    return true;
                }
            }
            arr[i][j] = 0;// 回溯
            return false;
        } else {
            return dfs(j == 8 ? i + 1 : i, j == 8 ? 0 : j + 1);
        }
    }

    private static boolean check(int i, int j) {
        // 同行
        for (int k = 0; k < 9; k++) {
            if (k != j && arr[i][k] == arr[i][j]) {
                return false;
            }
        }
        // 同列
        for (int k = 0; k < 9; k++) {
            if (k != i && arr[k][j] == arr[i][j]) {
                return false;
            }
        }
        // 同九宫
        int up = i / 3 * 3;
        int left = j / 3 * 3;
        for (int k = up; k < up + 3; k++) {
            for (int l = left; l < left + 3; l++) {
                if ((k != i || l != j) && arr[k][l] == arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
