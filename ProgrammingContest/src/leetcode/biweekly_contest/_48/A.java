package leetcode.biweekly_contest._48;

import java.util.HashSet;

public class A {
    public static void main(String[] args) {
        boolean c = Character.isDigit('c');
        boolean a = Character.isDigit('9');
        boolean letter = Character.isLetter('\\');
        System.out.println(a);
        System.out.println(letter);
        System.out.println(c);
    }

    class Solution {
        public int numDifferentIntegers(String word) {
            int n = word.length();
            HashSet<Long> set = new HashSet<>();
            for (int i = n - 1; i >= 0;) {
                long temp = 0;
                long mod = 1;
                while (Character.isDigit(word.charAt(i))){
                    temp += (word.charAt(i) - '0') * mod;
                    mod *= 10;
                    i--;
                }
                set.add(temp);
            }
            return set.size();
        }
    }
}
