package algorithm.basic;

import java.util.Arrays;
import java.util.Scanner;

public class JiShi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int now = 0;
        int res = 0;
        for(int i = 1;i < n;i++){
            if(arr[i] - arr[now] >= m){
                res++;
                now = i;
            }
        }
        System.out.println(res);
    }
}
