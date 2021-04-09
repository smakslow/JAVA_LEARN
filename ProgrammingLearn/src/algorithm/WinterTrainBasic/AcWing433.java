package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing433 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] str = reader.readLine().toCharArray();
        reader.close();
        int res = 0;
        for (int i = 0, j = 1; i < str.length - 1; i++) {
            if (str[i] != '-') {
                res += (str[i] - '0') * j;
                j++;
            }
        }
        res %= 11;
        char last = 'x';
        if (res < 10) last = (char) ('0' + res);
        if (last == str[str.length - 1]) System.out.println("Right");
        else {
            str[str.length - 1] = last;
            System.out.println(new String(str));
        }
    }
}
