package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing417 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 7;
        String[] str;
        int hour;
        int max = Integer.MIN_VALUE;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            str = reader.readLine().split(" ");
            hour = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
            if (hour > 8) {
                if(hour > max){
                    max = hour;
                    res = i;
                }
            }
        }
        reader.close();
        System.out.println(res);
    }
}
