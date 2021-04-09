package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1040 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int left = i - 1, right = i + 1;
            while (left >= 0 && right < str.length()) {
                if (str.charAt(left) == str.charAt(right)) {
                    left--;
                    right++;
                }else{
                    break;
                }
            }
            res = Math.max(res, right - left - 1);
        }
        for (int i = 0; i < str.length(); i++) {
            int left = i, right = i + 1;
            while (left >= 0 && right < str.length()) {
                if (str.charAt(left) == str.charAt(right)) {
                    left--;
                    right++;
                }else{
                    break;
                }
            }
            res = Math.max(res, right - left - 1);
        }

        return res;
    }
}
