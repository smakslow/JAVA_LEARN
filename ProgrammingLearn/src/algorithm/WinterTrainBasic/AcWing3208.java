package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing3208 {
    static int[][] arr = new int[510][510];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str;
        for (int i = 1; i <= n; i++) {
            str = reader.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(str[j - 1]);
            }
        }
        reader.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= 2 * n; i++) {
            if(i % 2 != 0){
                for (int j = 1; j < i; j++) {
                    if(j <= n && (i - j) >= 1 &&(i - j) <= n){
                        sb.append(arr[j][i - j]).append(" ");
                    }
                }
            }else{
                for (int j = i - 1; j >= 0; j--) {
                    if(j >= 1 && j <= n && (i - j) >= 1 &&(i - j) <= n){
                        sb.append(arr[j][i - j]).append(" ");
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
