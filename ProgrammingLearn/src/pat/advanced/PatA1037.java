package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PatA1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        int[] a = parse(str, c);
        int p = Integer.parseInt(reader.readLine());
        str = reader.readLine().split(" ");
        int[] b = parse(str, p);
        System.out.println(solution(a, b));
    }

    private static int[] parse(String[] str, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    private static int solution(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int res = 0;
        for (int i = 0, j = 0; i < a.length && j < b.length && a[i] < 0 && b[j] < 0; i++, j++) {
            res += a[i] * b[i];
        }
        for (int i = a.length - 1, j = b.length - 1; i >= 0 && j >= 0 && a[i] > 0 && b[j] > 0; i--, j--) {
            res += a[i] * b[i];
        }
        return res;
    }
}
