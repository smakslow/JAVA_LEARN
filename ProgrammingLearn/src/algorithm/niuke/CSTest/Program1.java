package algorithm.niuke.CSTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
��һ��Ϊ���������ͣ���ʾ����������ԭ�к�·������
        ���������У�ÿ�����ĸ���������ʾһ����·֮����������б�źͺ�·�ؿ����еĺ͡�
*/

public class Program1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str =reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[][] arr = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            str = reader.readLine().split(" ");
            int u = Integer.parseInt(str[0]);
            int v = Integer.parseInt(str[1]);
            int a = Integer.parseInt(str[2]);
            int b = Integer.parseInt(str[3]);

        }
    }
}
