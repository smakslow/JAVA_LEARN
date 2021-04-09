package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ12 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        char[] charArray = reader.readLine().toCharArray();
        reader.close();
        int n = charArray.length >> 1;
        char temp;
        for (int i = 0, j = charArray.length - 1; i < n; i++, j--) {
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        System.out.println(new String(charArray));
    }
}
