package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1044 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        str = reader.readLine().split(" ");
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(str[i - 1]);
        }
        StringBuilder sb = new StringBuilder();
        int min = Integer.MAX_VALUE;
        for (int i = 1, j = 0; i <= N; i++) {
            while (arr[i] - arr[j + 1] >= M) j++;
            if (arr[i] - arr[j] >= M) min = Math.min(arr[i] - arr[j], min);
        }
        for (int i = 1, j = 0; i <= N; ) {
            if (arr[i] - arr[j] == min) {
                sb.append(j + 1).append("-").append(i).append("\n");
                i++;
                j++;
            } else if (arr[i] - arr[j] > min) {
                j++;
            } else {
                i++;
            }
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
