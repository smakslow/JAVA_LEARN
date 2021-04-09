package algorithm.niuke.HW;

import java.util.Scanner;

public class HJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int res =  0;
        while( n != 0){
            if((n & 1) == 0) res++;
            n >>= 1;
        }
        System.out.println(res);
    }
}
