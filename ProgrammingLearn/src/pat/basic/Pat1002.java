package pat.basic;
/*
读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
输入格式：
每个测试输入包含 1 个测试用例，即给出自然数 n 的值。这里保证 n 小于10的100次方
输出格式：
在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，但一行中最后一个拼音数字后没有空格。
输入样例：
1234567890987654321123456789
输出样例：
yi san wu
 */

import java.util.Scanner;

public class Pat1002 {

   /* public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String[] a = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        String s = sc.next();
        int len = s.length();
        int sum = 0;
        for(int i=0 ;i<len ;i++){
            sum += (s.charAt(i)-48);
        }
        String s1 = sum+"";
        int len1 = s1.length();
        for(int i=0 ;i<len1-1 ;i++){
            System.out.print(a[s1.charAt(i)-48]+" ");
        }
        System.out.print(a[s1.charAt(len1-1)-48]);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        String s = sc.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        String s1 = sum + "";
        for (int i = 0; i < s1.length() - 1; i++) {
            System.out.print(arr[s1.charAt(i) - '0'] + " ");
        }
        System.out.print(arr[s1.charAt(s1.length() - 1) - '0']);
    }

}
