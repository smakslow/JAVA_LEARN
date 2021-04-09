package algorithm.niuke.HW;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ24{
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        String[] strs;
        while((str = reader.readLine()) != null){
            int n = Integer.parseInt(str);
            arr = new int[n];
            strs  = reader.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            solution(n);
        }

    }
    private static void solution(int n){
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            left[i] = 1;
            for (int j = 1; j < i; j++) {
                if (arr[i - 1] > arr[j - 1])
                    left[i] = Math.max(left[i], left[j] + 1);
            }
        }
        for (int i = n; i > 0; i--) {
            right[i] = 1;
            for (int j = n; j > i; j--) {
                if (arr[i - 1] > arr[j - 1])
                    right[i] = Math.max(right[i], right[j] + 1);
            }
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = Math.max(res, left[i] + right[i] - 1);
        }
        System.out.println(n - res);
    }
}
