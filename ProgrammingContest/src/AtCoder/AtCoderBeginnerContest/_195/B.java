package AtCoder.AtCoderBeginnerContest._195;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int w = in.nextInt() * 1000;
        int min = Integer.MAX_VALUE;
        int max = -1;
        int n = w / a;
        for (int i = 1; i <= n; i++) {
            if (a * i <= w && w <= b * i) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }
        if (max == -1) {
            System.out.println("UNSATISFIABLE");
            return;
        }
        System.out.println(min + " " + max);
    }
}
