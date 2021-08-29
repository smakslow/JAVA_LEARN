package leetcode.biweekly_contest._58;

public class A {
    class Solution {
        public String makeFancyString(String s) {
            char[] chars = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            int n = chars.length;
            for (int i = 0; i < n; ) {
                int cnt = 1;
                int j = i;
                while (j < n && chars[i] == chars[j]) {
                    if (cnt < 3) {
                        sb.append(chars[j]);
                    }
                    j++;
                    cnt++;
                }
                if (i == j) i++;
                else i = j;
            }
            return sb.toString();
        }
    }
}
