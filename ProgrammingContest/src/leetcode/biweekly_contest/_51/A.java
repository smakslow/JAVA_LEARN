package leetcode.biweekly_contest._51;

public class A {
    class Solution {
        public String replaceDigits(String s) {
            char[] chars = s.toCharArray();
            int n = chars.length;
            for (int i = 0; i + 1 < n; i += 2) {
                chars[i + 1] = (char) (chars[i] + (chars[i + 1] - '0'));
            }
            return new String(chars);
        }
    }
}
