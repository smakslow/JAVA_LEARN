package leetcode.weekly_contest._243;

public class A {
    class Solution {
        public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
            return sum(firstWord) + sum(secondWord) == sum(targetWord);
        }

        private int sum(String s) {
            char[] chars = s.toCharArray();
            int res = 0;
            for (char c : chars) {
                res = res * 10 + (c - 'a');
            }
            System.out.println(res);
            return res;
        }
    }
}
