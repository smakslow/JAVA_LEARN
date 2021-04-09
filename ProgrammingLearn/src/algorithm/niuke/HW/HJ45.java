package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HJ45 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String str;
        while ((str = reader.readLine()) != null) {
            n = Integer.parseInt(str);
            for (int i = 0; i < n; i++) {
                str = reader.readLine();
                System.out.println(solution(str));
            }
        }
        reader.close();
    }

    private static int solution(String str) {
        int[] count = new int[26];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        Arrays.sort(count);
        int res = 0;
        for (int i = count.length - 1, max = 26; i >= 0; i--) {
            if (count[i] == 0) break;
            res += count[i] * max;
            max--;
        }
        return res;

    }
}
