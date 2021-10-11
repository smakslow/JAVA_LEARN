package leetcode.daily;

import java.util.Arrays;

public class _1894 {
    class Solution {
        public int chalkReplacer(int[] chalk, int k) {
            int n = chalk.length;
            int i = 0;
            long sum = Arrays.stream(chalk).sum();
            k %= sum;
            while (i < n) {
                if (k >= chalk[i]) {
                    k -= chalk[i++];
                } else break;
            }
            return i;
        }
    }
}
