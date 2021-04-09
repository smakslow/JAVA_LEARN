package algorithm.basic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //�����������飬��ʼֵΪ0������Ϊn
        int[] password = new int[n];
        //����ѭ����ѭ������Ϊm������m�ּ������
        for (int i = 1; i <= m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int j = l;j<= r;j++){
                password[j]=i;
            }
        }
        long result = 0;
        for (int i = 0; i < password.length; i++) {
            result += (long)(i * password[i]);
        }
        result = result % 100000009L;
        System.out.println(result);
     
    }
}

