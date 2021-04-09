package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AcWing425 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        String[] str = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        reader.close();
        Arrays.sort(arr);
        int left = 0;
        for (int right = 0; right < n; right++){
            if (right == 0 || arr[right] != arr[right - 1])
                arr[left++] = arr[right];
        }
        System.out.println(left);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < left; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
