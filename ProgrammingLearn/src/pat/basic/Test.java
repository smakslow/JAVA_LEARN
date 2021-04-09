package pat.basic;

import java.util.Scanner;

public class Test {
     /*   public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;

            while( n!=1){
                if(  n%2 != 0){
                    n = (3*n + 1)/2;
                    count ++;

                }else{
                    n = n / 2;
                    count++;
                }
            }
            System.out.println(count);
        }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        String s = sc.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }

        String s1 = sum + "";
        for (int i = 0; i < s1.length() - 1; i++) {
            System.out.print(arr[s1.charAt(i)] + " ");
        }
        System.out.print(arr[s1.charAt(s1.length() - 1)]);
    }
}

