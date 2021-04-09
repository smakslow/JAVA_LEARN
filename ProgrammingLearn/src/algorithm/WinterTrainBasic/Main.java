package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int n, m;
    private static int[] h;
    private static int[] w;

    private static boolean check(int x) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += (h[i] / x) * (w[i] / x);
        }
        return res >= m;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        h = new int[n];
        w = new int[n];
        for (int i = 0; i < n; i++) {
            str = reader.readLine().split(" ");
            h[i] = Integer.parseInt(str[0]);
            w[i] = Integer.parseInt(str[1]);
        }
        int l = 1, r = 100000;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (check(mid)) l = mid;
            else r = mid - 1;
        }

        System.out.println(l);
    }
}
