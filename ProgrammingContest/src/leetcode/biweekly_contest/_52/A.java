package leetcode.biweekly_contest._52;

public class A {
    class Solution {
        public String sortSentence(String s) {
            String[] str = s.split(" ");
            int n = str.length;
            String[] res = new String[n];
            for (String s1 : str) {
                int index = s1.charAt(s1.length() - 1) - '0';
                res[index - 1] = s1.substring(0, s1.length() - 1);
            }
            StringBuilder sb = new StringBuilder();
            for (String re : res) {
                sb.append(re).append(' ');
            }
            return sb.toString().substring(0, sb.length() - 1);
        }
    }
}
