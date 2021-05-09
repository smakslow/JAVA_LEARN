package leetcode.biweekly_contest._51;

import java.util.Arrays;

public class C {
    class Solution {
        public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
            Arrays.sort(arr);
            int n = arr.length;
            arr[0] = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] <= 1) continue;
                arr[i] = arr[i - 1] + 1;
            }
            return arr[n - 1];
        }
    }
}
