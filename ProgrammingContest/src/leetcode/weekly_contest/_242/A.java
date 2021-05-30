package leetcode.weekly_contest._242;

public class A {
    public boolean checkZeroOnes(String s) {
        char[] chars = s.toCharArray();
        int a = 0, zero = 0;
        int b = 0, one = 0;
        for (char c : chars) {
            if (c == '0') {
                a++;
                b = 0;
            } else {
                b++;
                a = 0;
            }
            zero = Math.max(zero, a);
            one = Math.max(one, b);
        }
        return one > zero;
    }
}
