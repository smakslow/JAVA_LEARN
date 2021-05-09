package leetcode.weekly_contest._88;

public class A {
    class Solution {
        public String shiftingLetters(String S, int[] shifts) {
            int a = 0;
            for (int shift : shifts)
                a = (a + shift) % 26;
            char[] chars = S.toCharArray();
            for (int i = 0; i < shifts.length; ++i) {
                int index = chars[i] - 'a';
                chars[i] = ((char) ((index + a) % 26 + 'a'));
                a = Math.floorMod(a - shifts[i], 26);
            }

            return new String(chars);
        }
    }
}
