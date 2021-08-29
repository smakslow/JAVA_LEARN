package leetcode.weekly_contest._254;

public class A {
    class Solution {
        public int numOfStrings(String[] patterns, String word) {
            int ans = 0;
            for (String pattern : patterns) {
                if (word.contains(pattern)) ans++;
            }
            return ans;
        }
    }
}
