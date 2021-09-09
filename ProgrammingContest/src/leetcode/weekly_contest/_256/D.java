package leetcode.weekly_contest._256;

public class D {

    class Solution {
        int mod = (int) (1e9 + 7);

        public int numberOfUniqueGoodSubsequences(String binary) {
            char[] chars = binary.toCharArray();
            int n = chars.length;
            int dp0 = 0, dp1 = 0, zero = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (chars[i] == '0') {
                    zero = 1;
                    dp0 = (dp0 + dp1 + 1) % mod;
                } else {
                    dp1 = (dp0 + dp1 + 1) % mod;
                }
            }
            return (dp1 + zero) % mod;
        }
    }
}
