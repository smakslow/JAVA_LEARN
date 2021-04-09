package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing3203 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[4];
        String[] str;
        boolean[][] visited = new boolean[105][105];
        for (int i = 0; i < n; i++) {
            str = reader.readLine().split(" ");
            for (int j = 0; j < 4; j++) {
                arr[j] = Integer.parseInt(str[j]);
            }
            for (int j = arr[0]; j < arr[2]; j++) {
                for (int k = arr[1]; k < arr[3]; k++) {
                    visited[j][k] = true;
                }
            }
        }
        reader.close();
        int res = 0;
        for (int i = 0; i < 105; i++) {
            for (int j = 0; j < 105; j++) {
                if (visited[i][j]) res++;
            }
        }
        System.out.println(res);
    }
}
