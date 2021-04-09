package algorithm.basic;

import java.util.Scanner;

//basic-4
public class ArrayPro {
    public static void main(String[] args) {
        int max, min, count;
        Scanner scanner = new Scanner(System.in);
        String length = scanner.nextLine();
        int len = Integer.parseInt(length);
        String str = scanner.nextLine();

        String[] strs = str.split(" ");
        int[] num = new int[len];

        for (int i = 0; i < len; i++) {
            num[i] = Integer.parseInt(strs[i]);
        }
        scanner.close();

        max = min = count = num[0];

        for (int i = 1; i < len; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
            count += num[i];

        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(count);
    }
}
