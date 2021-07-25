package leetcode.weekly_contest._250;

import java.util.HashSet;

public class A {
    class Solution {
        public int canBeTypedWords(String text, String brokenLetters) {
            String[] s = text.split(" ");
            char[] chars = brokenLetters.toCharArray();
            HashSet<Character> set = new HashSet<>();
            for (char c : chars) {
                set.add(c);
            }
            int ans = 0;
            for (String t : s) {
                boolean f = true;
                for (int i = 0; i < t.length(); i++) {
                    if (set.contains(t.charAt(i))) {
                        f = false;
                        break;
                    }
                }
                if(f) ans++;
            }
            return ans;
        }
    }
}
