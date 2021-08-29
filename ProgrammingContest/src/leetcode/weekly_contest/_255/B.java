package leetcode.weekly_contest._255;

import java.util.Arrays;
import java.util.HashSet;

public class B {
    static class Solution {
        String ans;

        public String findDifferentBinaryString(String[] nums) {
            HashSet<String> set = new HashSet<>(Arrays.asList(nums));
            int n = nums[0].length();
            dfs(new StringBuilder(), n, set);
            return ans;
        }

        private void dfs(StringBuilder s, int n, HashSet<String> set) {
            if (s.length() == n && !set.contains(s.toString())) {
                ans = s.toString();
                return;
            }
            if (s.length() > n) return;
            s.append('0');
            dfs(s, n, set);
            s.deleteCharAt(s.length() - 1);
            s.append('1');
            dfs(s, n, set);
            s.deleteCharAt(s.length() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findDifferentBinaryString(new String[]{"00", "10"}));
    }
}
