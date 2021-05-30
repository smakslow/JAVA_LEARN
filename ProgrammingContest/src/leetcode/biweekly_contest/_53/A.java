package leetcode.biweekly_contest._53;

public class A {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            String substring = s.substring(i, i + 3);
            if (substring.charAt(0) != substring.charAt(1) && substring.charAt(1) != substring.charAt(2) &&
                    substring.charAt(0) != substring.charAt(2)) ans++;
        }
        return ans;
    }
}
