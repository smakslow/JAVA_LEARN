package algorithm.BeautyOfProgram;

import java.util.Scanner;

public class BOP2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorialZero(scanner.nextInt()));
        System.out.println(factorialZero1(scanner.nextInt()));
        scanner.close();
    }

    private static int factorialZero(int n) {
        int ret = 0;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j % 5 == 0) {
                ret++;
                j /= 5;
            }
        }
        return ret;
    }

    private static  int factorialZero1(int n){
        int ret = 0;
        while( n != 0){
            ret +=  n /5;
            n /= 5;
        }
        return  ret;
    }
}
