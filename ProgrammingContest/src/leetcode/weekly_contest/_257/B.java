package leetcode.weekly_contest._257;

import java.util.Arrays;

public class B {
    class Solution {
        public int numberOfWeakCharacters(int[][] properties) {
            Arrays.sort(properties, ((o1, o2) -> {
                if (o1[0] == o2[0]) return o1[1] - o2[1];
                return o2[0] - o1[0];
            }));
            int ans = 0;
            int a = properties[0][0], b = properties[0][1];
            for (int[] property : properties) {
                if (a > property[0] && property[1] < b) {
                    ans++;
                } else {
                    a = property[0];
                    b = property[1];
                }
            }
            return ans;
        }
    }
}
