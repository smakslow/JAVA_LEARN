package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing1353 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i + 17 <= 100; i++) {
            int cost = 0,left = i, right = i + 17;
            for (int j = 0; j < n; j++) {
                if(arr[j] < left) cost +=(arr[j] - left) * (arr[j] - left);
                else if (arr[j] > right) cost +=(arr[j] - right) *(arr[j] - right);
            }
            res = Math.min(res,cost);
        }
        System.out.println(res);
    }
}
