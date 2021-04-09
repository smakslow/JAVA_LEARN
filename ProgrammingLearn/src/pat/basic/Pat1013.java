package pat.basic;

import java.util.Scanner;

/*
1013 数素数 (20 分)
        令P​i表示第 i 个素数。现任给两个正整数 M≤N≤10，请输出 P
        ​M到P​N的所有素数。
        输入格式：
        输入在一行中给出 M 和 N，其间以空格分隔。
        输出格式：
        输出从 PM到PN的所有素数，每 10 个数字占 1 行，其间以空格分隔，但行末不得有多余空格。
        输入样例：
        5 27
        输出样例：
        11 13 17 19 23 29 31 37 41 43
        47 53 59 61 67 71 73 79 83 89
        97 101 103
 */
public class Pat1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        show(m, n);
    }

    public static void show(int m, int n) {
        for (; m < n; m++) {
            for (int i = 2; i < (m / 2); i++) {
                if (m % i == 0) {
                    break;
                }
                System.out.println(m);
            }

        }
    }
}
