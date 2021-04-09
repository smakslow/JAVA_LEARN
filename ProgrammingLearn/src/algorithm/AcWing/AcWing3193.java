package algorithm.AcWing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing3193 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().toCharArray();
        reader.close();
        int res = 0;
        for (int i = 0, j = 1; i < chars.length; i++) {
            if (chars[i] != '-') {
                res += (chars[i] - '0') * j;
                j++;
            }
        }
        res %= 11;
        char temp =  (char)(res + '0');
        if (chars[chars.length - 1] == temp) {
            System.out.println("Right");
            return;
        }

        if (res == 10) temp = 'X';
        chars[chars.length - 1] = temp;
        System.out.println(new String(chars));
    }
}
