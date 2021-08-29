package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class AcWing429 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[][] num = new int[n][4];
        String[] str;
        for (int i = 0; i < n; i++) {
            str = reader.readLine().split(" ");
            num[i][0] = Integer.parseInt(str[0]);
            num[i][1] = Integer.parseInt(str[1]);
            num[i][2] = Integer.parseInt(str[2]);
            num[i][3] = i + 1;
        }

        Arrays.sort(num, (a, b) -> {     //传进来的是一行的数据，a = {90,67,80,1} B = {87,66,91,2}
            int s1 = a[0] + a[1] + a[2];
            int s2 = b[0] + b[1] + b[2];
            if (s1 != s2) return s2 - s1;           //总成绩按照从大到小排序
            if (a[0] != b[0]) return b[0] - a[0];   //语文成绩按照从大到小排序
            return a[3] - b[3];                    //学号按照从小到大排序
        });

        for (int i = 0; i < 5; i++)                    //输出结果
        {
            System.out.println(num[i][3] + " " + (num[i][0] + num[i][1] + num[i][2]));
        }
    }
}
