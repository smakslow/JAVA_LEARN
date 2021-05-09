package aliyun.tianchi.No_0;

import java.util.HashSet;

public class D {
    public char findLetter(String str) {
        // Write your code here.
        char ans = '~';
        char[] chars = str.toCharArray();
        HashSet<Character> set1 = new HashSet<>();//ด๓ะด
        HashSet<Character> set2 = new HashSet<>();//ะกะด
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                set1.add(c);
                if (set2.contains(Character.toLowerCase(c))) {
                    if (ans != '~') {
                        ans = c > ans ? c : ans;
                    } else {
                        ans = c;
                    }
                }
            }
            if (Character.isLowerCase(c)) {
                set2.add(c);
                char upperCase = Character.toUpperCase(c);
                if (set1.contains(upperCase)) {
                    if (ans != '~') {
                        ans = upperCase > ans ? upperCase : ans;
                    } else {
                        ans = upperCase;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println((int) ('A'));
        System.out.println((int) ('a'));
        System.out.println((int) ('~'));
    }
}
