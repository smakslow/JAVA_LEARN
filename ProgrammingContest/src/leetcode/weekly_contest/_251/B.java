package leetcode.weekly_contest._251;

public class B {
    class Solution {
        public String maximumNumber(String num, int[] change) {
            StringBuilder sb = new StringBuilder();
            char[] chars = num.toCharArray();
            int n = chars.length;
            boolean flag = false;
            for (int i = 0; i < n; ) {
                int j = i;
                if ((chars[j] - '0') == change[chars[j] - '0']) {
                    sb.append(chars[i]);
                    i++;
                    continue;
                }
                while (!flag && j < n && (chars[j] - '0') <= change[chars[j] - '0']) {
                    sb.append(change[chars[j] - '0']);
                    j++;
                }
                if (i != j) {
                    i = j;
                    flag = true;
                } else {
                    sb.append(chars[i]);
                    i++;
                }
            }
            return sb.toString();
        }
    }
}
