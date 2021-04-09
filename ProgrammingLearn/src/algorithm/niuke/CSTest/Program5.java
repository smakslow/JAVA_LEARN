package algorithm.niuke.CSTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*ţţ���о����֣����ǳ�ϲ������λ֮�����ֲ���С������������������һ�֡��������������涨һ��������������������<=��С����*2����ô������������ͽ�����������
        �ٸ����ӣ�1,9,11,968,874���ǽ�������10,625,407,33542�����ǽ�������*/
public class Program5 {
    /* 3
             1 9
             21 21
             13 20*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        String[] str;
        int left, right;
        for (int i = 0; i < T; i++) {
            str = reader.readLine().split(" ");
            left = Integer.parseInt(str[0]);
            right = Integer.parseInt(str[1]);
            System.out.println(solution(left, right));
        }
        reader.close();
    }

    private static int solution(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (check(i)) count++;
        }
        return count;
    }

    private static boolean check(int num) {
        String str = String.valueOf(num);
        int max = 0;
        int min = 9;
        int temp;
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i) - '0';
            if (max < temp) max = temp;
            if (min > temp) min = temp;
        }
        System.out.println(max + "  "+ min);
        return max <= (min << 1);
    }
}
