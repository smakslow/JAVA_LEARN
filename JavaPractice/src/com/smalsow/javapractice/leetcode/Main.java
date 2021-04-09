package com.smalsow.javapractice.leetcode;

/*6
        add 1
        add 2
        add 3
        peek
        poll
        peek*/

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i <n;++i)
            arr[i] = sc.nextInt();
        sc.close();
        Arrays.sort(arr);
        int res = 0;
        int mid = arr[n/2];
        for(int i = 0;i < n;++i){
            res += Math.abs(arr[i] - mid);
        }
        System.out.println(res);
    }

}
