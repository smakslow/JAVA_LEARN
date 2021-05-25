package leetcode.weekly_contest._242;

public class A {
    public boolean checkZeroOnes(String s) {
        char[] chars = s.toCharArray();
        int a = 0;
        int b = 0;
        for (int i = 0; i < chars.length; i++) {
            int t = i;
            int k = i;
            while (t > 0) {
                if (chars[t - 1] == chars[i]) {
                    t--;
                } else break;
            }
            while (k < chars.length - 1) {
                if (chars[k + 1] == chars[i]) {
                    k++;
                } else break;
            }
            if (chars[i] == '0') {
                a = Math.max(a, k - t);
            } else {
                b = Math.max(b, k - t);
            }
        }
        return b > a;
    }
}
