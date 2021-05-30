package leetcode.weekly_contest._243;

public class B {
    class Solution {
        public String maxValue(String n, int x) {
            StringBuilder sb = new StringBuilder();
            if (n.charAt(0) == '-') {
                int k = 1;
                while (k < n.length() && n.charAt(k) - '0' <= x) k++;
                sb.append(n, 0, k).append(x).append(n.substring(k));
            } else {
                int k = 0;
                while (k < n.length() && n.charAt(k) - '0' >= x) k++;
                sb.append(n, 0, k).append(x).append(n.substring(k));
            }
            return sb.toString();
        }
    }
}
