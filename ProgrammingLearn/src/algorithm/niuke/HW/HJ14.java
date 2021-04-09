package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HJ14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = reader.readLine();
        }
        reader.close();
        Arrays.sort(strings);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(strings[i]).append("\n");
        }
        System.out.println(sb);
    }
}
