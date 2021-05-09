package leetcode.weekly_contest._83;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {
    class Solution {
        public List<List<Integer>> largeGroupPositions(String s) {
            List<List<Integer>> ans = new ArrayList<>();
            for (int i = 0; i < s.length(); ) {
                int j = i + 1;
                while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                    j++;
                }
                if (j - i  >= 3) {
                    ans.add(Arrays.asList(i, j - 1));
                }
                i = j;
            }
            return ans;
        }
    }
}
