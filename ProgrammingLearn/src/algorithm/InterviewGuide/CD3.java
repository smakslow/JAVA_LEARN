package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
题目描述
        给定排序数组arr和整数k，不重复打印arr中所有相加和为k的不降序二元组
        例如, arr = [-8, -4, -3, 0, 1, 2, 4, 5, 8, 9], k = 10，打印结果为：
        1, 9
        2, 8
        [要求]
        时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)
        输入描述:
        第一行有两个整数n, k
        接下来一行有n个整数表示数组内的元素
        输出描述:
        输出若干行，每行两个整数表示答案
        按二元组从小到大的顺序输出(二元组大小比较方式为每个依次比较二元组内每个数)
        示例1
        输入
        复制
        10 10
        -8 -4 -3 0 1 2 4 5 8 9
        输出
        复制
        1 9
        2 8
*/

public class CD3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        str = reader.readLine().split(" ");
        reader.close();
        int[] arr = parse(str,n);
        int i = 0,j = n - 1;
        while(i < j){
            if(arr[i] + arr[j] == k){
                if(i==0 || arr[i] != arr[i - 1])
                    System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            } else if(arr[i] + arr[j] > k) j--;
            else i++;
        }
    }
    private static int[] parse(String[] str,int n){
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }
}
