package algorithm.WinterTrainBasic;

import java.util.Scanner;

public class AcWing1381 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n =  scanner.nextInt();
       scanner.close();
       int res =1 ,d2 = 0, d5 = 0;
        for (int i = 1; i <= n; i++) {
              int x  = i;
              while(x % 2 == 0){
                  x/=2;
                  d2++;
              }
              while(x %5 == 0){
                  x/=5;
                  d5++;
              }
              res = res * x % 10;
        }
        int k = Math.min(d2,d5);
        for (int i = 0; i < d2 - k; i++) {
            res = res * 2 %10;
        }
        for (int i = 0; i < d5 - k; i++) {
            res = res * 5 % 10;
        }
        System.out.println(res);
    }
}
