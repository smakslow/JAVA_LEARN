package leetcode.biweekly_contest._54;

public class B {
    class Solution {
        public int chalkReplacer(int[] chalk, int k) {
            long sum = 0;
            for (int c : chalk) {
                sum += c;
            }
            k %= sum;
            int res = -1;
            for (int i = 0; i < chalk.length; i++) {
                if (chalk[i] > k) {
                    res = i;
                    break;
                }
                k -= chalk[i];
            }
            return res;
        }
    }
}
