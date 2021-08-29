package algorithm.niuke;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] chars = in.nextLine().toCharArray();
        int k = in.nextInt();
        int[] cnt = new int[26];
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && chars[j] == chars[i]) {
                j++;
            }
            cnt[chars[i] - 'A'] = Math.max(cnt[chars[i] - 'A'], j - i);
        }
        Arrays.sort(cnt);
        if (cnt[26 - k]== 0) System.out.println("-1");
        else System.out.println(cnt[26 - k]);
    }
}
