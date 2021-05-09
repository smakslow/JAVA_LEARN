package leetcode.biweekly_contest._49;

import java.util.HashSet;
import java.util.Set;

public class A {
    class Solution {
        public boolean squareIsWhite(String coordinates) {
            Set<Character> black = new HashSet<>();
            black.add('a');
            black.add('c');
            black.add('e');
            black.add('g');
            char a = coordinates.charAt(0);
            int b = coordinates.charAt(1) - '0';
            if (black.contains(a)) {
                return b % 2 == 0;
            }
            return b % 2 != 0;
        }
    }
}
