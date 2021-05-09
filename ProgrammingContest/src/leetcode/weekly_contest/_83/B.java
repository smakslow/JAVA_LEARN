package leetcode.weekly_contest._83;

public class B {
    class Solution {
        public String maskPII(String S) {
            int atIndex = S.indexOf('@');
            if (atIndex >= 0) { // email
                return (S.substring(0, 1) + "*****" + S.substring(atIndex - 1)).toLowerCase();
            } else { // phone
                String digits = S.replaceAll("\\D+", "");
                String local = "***-***-" + digits.substring(digits.length() - 4);
                if (digits.length() == 10) return local;
                StringBuilder ans = new StringBuilder("+");
                for (int i = 0; i < digits.length() - 10; ++i)
                    ans.append("*");
                return ans + "-" + local;
            }
        }
    }
}
