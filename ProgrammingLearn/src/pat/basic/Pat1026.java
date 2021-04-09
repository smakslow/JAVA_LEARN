package pat.basic;

import java.util.Scanner;

public class Pat1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = b - a;
        if (res % 100 >= 50) {
            res = res / 100 + 1;
        } else {
            res /= 100;
        }
        System.out.printf("%2d:%2d:%2d\n", res / 3600, res % 3600 / 60, res % 60);
    }
}
