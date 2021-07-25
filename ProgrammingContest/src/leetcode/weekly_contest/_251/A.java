package leetcode.weekly_contest._251;

public class A {
    class Solution {
        public int getLucky(String s, int k) {
            long ans = 0;
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append(c - 'a' + 1);
            }
            s = sb.toString();
            for (int i = 0; i < k; i++) {
                ans = 0;
                for (char c : s.toCharArray()) {
                    ans += (c- '0');
                }
                s = String.valueOf(ans);
            }
            return (int) ans;
        }
    }
}
