package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AcWing1603 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        reader.close();
        solution(arr, n);
    }

    private static void solution(int[] arr, int n) {
        Arrays.sort(arr);
        int mid = n >> 1;
        int left = 0;
        int right = 0;
        for (int i = 0; i < mid; i++) {
            left += arr[i];
        }
        for (int i = mid; i < n; i++) {
            right += mid;
        }
        System.out.println(n % 2 == 1 ? 1 : 0 + " " + (right - left));
    }
}
