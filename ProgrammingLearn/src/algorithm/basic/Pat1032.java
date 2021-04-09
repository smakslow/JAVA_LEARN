package algorithm.basic;

import java.util.Scanner;

public class Pat1032 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] school = new int[]{num};
        for(int i = 0 ; i < num ; i ++){
            int schId = sc.nextInt();
            int score = sc.nextInt();
            school[schId] += score;
            System.out.println(score);
        }
        sc.close();
        int k= 1;
        int large = -1;
        for(int i = 1;i <= num; i++){
            if(school[i] > large){
                large = school[i];
                k = i;
            }
        }
        System.out.println(k+" " + large);
    }
}
