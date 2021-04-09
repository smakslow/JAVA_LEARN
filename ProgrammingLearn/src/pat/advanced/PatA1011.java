package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1011 {
    static char[] chars = {'W', 'T', 'L'};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str;
        double res = 1.0, temp;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            temp = 0.0;
            str = reader.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                Double num = Double.parseDouble(str[j]);
                if (num > temp) {
                    temp = num;
                    index = j;
                }
            }
            res *= temp;
            System.out.print(chars[index] + " ");
        }
        //System.out.printf("%.2f",(res * 0.65 - 1) * 2);
        System.out.println(String.format("%.2f", (res*0.65 - 1) * 2));
    }
}
