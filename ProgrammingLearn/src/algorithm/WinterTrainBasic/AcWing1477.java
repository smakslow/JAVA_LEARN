package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing1477 {
    static String[] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        reader.close();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (str.charAt(i) - '0');
        }
        str = String.valueOf(sum);
        for (int i = 0; i < str.length(); i++) {
            sb.append(eng[str.charAt(i) - '0']).append(" ");
        }
        System.out.println(sb.toString());
    }
}
