package algorithm.niuke.CSTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*牛牛在研究数字，他非常喜欢各数位之间数字差异小的数。所以他定义了一种“近亲数”，他规定一个正整数中如果最大数字<=最小数字*2，那么这个正整数数就叫做近亲数。
        举个例子，1,9,11,968,874都是近亲数，10,625,407,33542都不是近亲数。*/
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
