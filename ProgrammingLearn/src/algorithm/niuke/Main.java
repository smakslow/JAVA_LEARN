package algorithm.niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static boolean judge(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    private static String convert(int num, int b) {
        String code = "0123456789ABCDEFGHIJ";
        StringBuilder sb = new StringBuilder();
        int mod;
        while (num != 0) {
            mod = num % b;
            num /= b;
            sb.append(code.charAt(mod));
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        reader.close();
        int temp;
        String str1;
        String str2;
        for (int i = 1; i <= 300; i++) {
            temp = i * i;
            str1 = convert(i, b);
            str2 = convert(temp, b);
            if (judge(str1) && judge(str2)) {
                System.out.println(str1 + " " + str2);
            }
        }
    }
}
