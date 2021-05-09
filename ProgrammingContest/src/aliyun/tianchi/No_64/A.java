package aliyun.tianchi.No_64;

import java.util.Arrays;

public class A {
    public int[] SquareArray(int[] A) {
        // write your code here
        int n = A.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = A[i] * A[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
