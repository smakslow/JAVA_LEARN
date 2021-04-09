package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class AcWing1341 {
    private static int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    private  static  int[] weekday = new int[7];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        int days = 0;
        for (int year = 1900; year < 1900 + n; year++) {
            for (int i = 1; i <= 12; i++) {
                weekday[(days + 12 ) %7] ++;
                days += month[i];
                if(i == 2){
                    if((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)){
                        days++;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 5,j = 0; j  < 7 ; i = (i + 1) % 7,j++) {
            sb.append(weekday[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
    private  static  void  solution(){
        Calendar c = Calendar.getInstance();//创建Calendar类实例
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[7]; //定义数组存放13号为周六~周五的频率，顺序和题目要求有关
        for (int i = 0; i < 12 * n; i++) {
            c.set(1900, i, 13);//设置Calendar类日期，Calendar类会自动根据溢出的月份调整年份
            int a = c.get(Calendar.DAY_OF_WEEK);//获取本年月的13号是周几，1~7表示周日~周六
            b[a % 7]++;//相应频数加一，因为7表示周6，根据题意b[0]表示周六，1表示周日，由题意b[1]表示周日，以此类推可知，将a对7取余即可知道该让数组中哪个元素加一
        }
        for (int i = 0; i < 7; i++)
            System.out.print(b[i] + " ");

    }

}
