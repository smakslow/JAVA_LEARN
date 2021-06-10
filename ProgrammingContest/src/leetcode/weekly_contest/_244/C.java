package leetcode.weekly_contest._244;

public class C {
    class Solution {
        public int minFlips(String s) {
            char[] str = s.toCharArray();

            int n = str.length;
            int[][] prefix = new int[2][n];

            for(int i = 0; i < 2; ++i) {
                for(int j = 0, k = i, cnt = 0; j < n; ++j) {
                    if(k != str[j] - '0') {
                        cnt++;
                    }
                    prefix[i][j] = cnt;
                    k ^= 1;
                }
            }

            int min = Math.min(prefix[0][n - 1], prefix[1][n - 1]);
            if((n & 1) != 0) {
                int[][] suffix = new int[2][n];
                for(int i = 0; i < 2; ++i) {
                    for(int j = n - 1, k = i, cnt = 0; j >= 0; --j) {
                        if(k != str[j] - '0') {
                            cnt++;
                        }
                        suffix[i][j] = cnt;
                        k ^= 1;
                    }
                }

                for(int i = 0; i + 1 < n; ++i) {
                    min = Math.min(min, prefix[0][i] + suffix[1][i + 1]);
                    min = Math.min(min, prefix[1][i] + suffix[0][i + 1]);
                }
            }

            return min;
        }
    }
}
