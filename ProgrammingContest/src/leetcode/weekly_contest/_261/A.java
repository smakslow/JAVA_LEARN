package leetcode.weekly_contest._261;

public class A {
    class Solution {
        public int minimumMoves(String s) {
            char[] chars = s.toCharArray();
            int ans = 0;
            for (int i = 0; i < chars.length; ) {
                if (chars[i] == 'O') {
                    i++;
                    continue;
                }
                boolean flag = false;
                for (int j = i; j < i + 3 && j < chars.length; j++) {
                    if (chars[j] == 'X') {
                        flag = true;
                        break;
                    }
                }
                if (flag) ans++;
                i += 3;
            }
            return ans;
        }
    }
}
