package pat.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatA1049 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println(countDigitOne(n));
    }

    private static int countDigitOne(int n) {
        int res = 0;
        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 10);
            n /= 10;
        }
        // 用list反转过来了，左边为低位，右边为高位
        //  123 4 567
        for (int x = 0; x < list.size(); x++) {

            int d = list.get(x);
            int high = 0, low = 0, e = 1;
            for (int i = list.size() - 1; i > x; i--)
                high = high * 10 + list.get(i);
            for (int i = x - 1; i >= 0; i--) {
                low = low * 10 + list.get(i);
                e *= 10;
            }
            if (d == 0) {
                res = res + high * e;
            } else if (d == 1) {
                res = res + high * e + low + 1;
            } else {
                res = res + (high + 1) * e;
            }
        }
        return res;
    }
}
