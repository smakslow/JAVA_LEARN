package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int g = Integer.parseInt(str);

            if (g == 0) {
                return;
            }

            int count = 0;

            do {
                int f = g / 3;
                count += f;
                g = g % 3 + f;

            } while (g >= 3);

            if (g == 2) {
                count += 1;
            }
            System.out.println(count);
        }
    }
}

