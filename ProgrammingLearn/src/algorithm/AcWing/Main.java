import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int n, m;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        arr = new int[n];
        s = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);
        double l = 0, r = 1e9;
        while (r - l > 1e-4) {
            double mid = (l + r) / 2;
            if (check(mid)) l = mid + 0.001;
            else r = mid;
        }
        System.out.printf("%.2f", l);
    }

    private static boolean check(double mid) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp += arr[i] / mid;
            if (temp >= m) return true;
        }
        return false;
    }
}
