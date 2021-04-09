package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1029 {
    private static int[] A, B;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        A = parse(str);
        str = reader.readLine().split(" ");
        reader.close();
        B = parse(str);
        System.out.println(findMedianSortedArrays(A, B));
    }

    private static int[] parse(String[] str) {
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    private static int findMedianSortedArrays(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int mid = (n + m -1) >> 1;
        int i = 0, j = 0, cnt = 0;
        while (cnt < mid) //双指针寻找中位数，若a[i]<b[j]，则a[i]排在前面，i++，反之b[i]排在前面，j++
        {
            if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
            cnt++;
        }
        return a[i] < b[j] ? a[i] : b[j];
    }
}
