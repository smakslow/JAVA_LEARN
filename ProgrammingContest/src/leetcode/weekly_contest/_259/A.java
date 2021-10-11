package leetcode.weekly_contest._259;

public class A {
    class Solution {
        public int finalValueAfterOperations(String[] operations) {
            int ans = 0;
            for (String operation : operations) {
                char[] chars = operation.toCharArray();
                if (chars[1] == '+') ans++;
                else ans--;
            }
            return ans;
        }
    }
}
