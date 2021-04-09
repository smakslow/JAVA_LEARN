package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] c = reader.readLine().toCharArray();
        reader.close();
        StringBuilder builder = new StringBuilder();
        for (int i = c.length - 1; i >= 0 ; i--) {
            builder.append(c[i]);
        }
        System.out.println(builder);
    }
}
