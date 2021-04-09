package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        reader.close();
        StringBuilder sb = new StringBuilder();
        for (int i = str.length; i >= 0 ; i--) {
            sb.append(str[i]).append(" ");
        }
        System.out.println(sb);
    }
}
