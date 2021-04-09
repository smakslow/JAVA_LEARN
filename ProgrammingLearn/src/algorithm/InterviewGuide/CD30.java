package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD30 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        String[] str = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        reader.close();
        //System.out.println(step1(arr));
        System.out.println(step2(arr));
    }

    private static int step1(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        return process(arr, arr.length - 1, 1, 2, 3);
    }

    private static int process(int[] arr, int i, int from, int mid, int to) {
        if (i == -1) return 0;
        if (arr[i] != from && arr[i] != to) return -1;
        if (arr[i] == from) return process(arr, i - 1, from, to, mid);
        else {
            int rest = process(arr, i - 1, mid, from, to);
            if (rest == -1) return -1;
            return rest + (1 << i);
        }
    }

    public static long step2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int from = 1;
        int mid = 2;
        int to = 3;
        int i = arr.length - 1;
        long res = 0;
        int tmp = 0;
        while (i >= 0) {
            if (arr[i] != from && arr[i] != to) {
                return -1;
            }
            if (arr[i] == to) {
                res += 1 << i;
                tmp = from;
                from = mid;
            } else {
                tmp = to;
                to = mid;
            }
            mid = tmp;
            i--;
        }
        return res;
    }
}
