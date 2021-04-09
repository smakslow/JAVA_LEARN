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
        Calendar c = Calendar.getInstance();//����Calendar��ʵ��
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[7]; //����������13��Ϊ����~�����Ƶ�ʣ�˳�����ĿҪ���й�
        for (int i = 0; i < 12 * n; i++) {
            c.set(1900, i, 13);//����Calendar�����ڣ�Calendar����Զ�����������·ݵ������
            int a = c.get(Calendar.DAY_OF_WEEK);//��ȡ�����µ�13�����ܼ���1~7��ʾ����~����
            b[a % 7]++;//��ӦƵ����һ����Ϊ7��ʾ��6����������b[0]��ʾ������1��ʾ���գ�������b[1]��ʾ���գ��Դ����ƿ�֪����a��7ȡ�༴��֪�������������ĸ�Ԫ�ؼ�һ
        }
        for (int i = 0; i < 7; i++)
            System.out.print(b[i] + " ");

    }

}
