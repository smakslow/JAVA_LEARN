package leetcode.weeklyrace._234;

public class B {
    class Solution {
        public int reinitializePermutation(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i;
            }
            int[] res = new int[n];
            ex(arr, res, n);
            int ret = 1;
            while (!eq(arr, res, n)) {
                res = ex(res, new int[n], n);
                ret++;
            }
            return ret;
        }

        private boolean eq(int[] arr, int[] res, int n) {
            for (int i = 0; i < n; i++) {
                if (arr[i] != res[i]) {
                    return false;
                }
            }
            return true;
        }

        private int[] ex(int[] arr, int[] res, int n) {
            int temp = n >> 1;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    res[i] = arr[i >> 1];
                } else {
                    res[i] = arr[temp + ((i - 1) >> 1)];
                }
            }
            return res;
        }
    }
}
