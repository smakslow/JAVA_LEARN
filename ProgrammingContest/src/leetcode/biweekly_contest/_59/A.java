package leetcode.biweekly_contest._59;

public class A {
    class Solution {
        public int minTimeToType(String word) {
            char[] chars = word.toCharArray();
            int ans = 0;
            char last = 'a';
            for (char now : chars) {
                ans += 1 + Math.min( (last - now + 26) % 26, (now - last + 26) % 26);
                last = now;
            }
            return ans;
        }
    }
}
