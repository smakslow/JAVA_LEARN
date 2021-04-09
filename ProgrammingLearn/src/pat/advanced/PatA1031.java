package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1031 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int n = str.length() + 2;
        int n1 = n / 3;
        int n2 = n / 3 + n % 3;
        int index = 0;
        char[][] chars = new char[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                chars[i][j] = ' ';
            }
        }
        for (int i = 0; i < n1; i++) {
            chars[i][0] = str.charAt(index++);
        }
        for (int i = 1; i <= n2 - 2; i++) {
            chars[n1 - 1][i] = str.charAt(index++);
        }
        for (int i = n1 - 1; i >= 0; i--) {
            chars[i][n2 - 1] = str.charAt(index++);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                sb.append(chars[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.substring(0,sb.length() - 2));
    }
}
