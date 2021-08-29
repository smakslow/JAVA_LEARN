package leetcode.weekly_contest._253;

public class A {
    class Solution {
        public boolean isPrefixString(String s, String[] words) {
            StringBuilder sb = new StringBuilder();
            int n = s.length();
            for (String word : words) {
                if (sb.length() < n) {
                    sb.append(word);
                } else break;
            }
            return sb.toString().equals(s);
        }
    }
}
