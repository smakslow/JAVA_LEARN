package niukecontest.noipbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing413 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        while ((str = reader.readLine()) != null) {
            sb.append(str);
        }
        int win = 0, fail = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != 'E') {
                if (win == 11 || fail == 11) {
                    System.out.println(win + ":" + fail);
                    win = fail = 0;
                    continue;
                }
                if (sb.charAt(i) == 'W') {
                    win++;
                } else {
                    fail++;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != 'E') {
                if (win == 21 || fail == 21) {
                    System.out.println(win + ":" + fail);
                    win = fail = 0;
                    continue;
                }
                if (sb.charAt(i) == 'W') {
                    win++;
                } else {
                    fail++;
                }
            }
        }

    }
}
