package leetcode.weekly_contest._87;

public class A {
    class Solution {
        public boolean backspaceCompare(String s, String t) {
           return solution(s).equals(solution(t));
        }

        private String solution(String s) {
            char[] chars = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char aChar : chars) {
                if (Character.isLetter(aChar)) {
                    sb.append(aChar);
                } else {
                    if (sb.length() > 0) {
                        sb.delete(sb.length() - 1, sb.length());
                    }
                }
            }

            return sb.toString();
        }
    }
}
