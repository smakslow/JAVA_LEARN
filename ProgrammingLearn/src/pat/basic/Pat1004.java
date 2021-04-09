package pat.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pat1004 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int n = 0;
        try {
            n = Integer.valueOf(s);
        } catch (Exception e) {
            System.exit(0);
        }
        if (n < 1) {
            System.exit(0);
        }
        String[] sname = new String[n];
        String[] sno = new String[n];
        int[] grade = new int[n];
        int min_index = 100, min = 100, max_index = 0, max = 0;
        for (int i = 0; i < n; i++) {
            String ss = bufferedReader.readLine();
            String[] arraySs = ss.split(" ");
            if (arraySs[0].length() < 1 || arraySs[0].length() > 10 || arraySs[1].length() < 1 || arraySs[1].length() > 10) {
                System.exit(0);
            }
            sname[i] = arraySs[0];
            sno[i] = arraySs[1];
            try {
                grade[i] = Integer.valueOf(arraySs[2]);
            } catch (Exception e) {
                System.exit(0);
            }
            if (grade[i] < 0 || grade[i] > 100) {
                System.exit(0);
            }
        }
        for (int j = 0; j < n; j++) {
            if (grade[j] > max) {
                max = grade[j];
                max_index = j;
            }
            if (grade[j] < min) {
                min = grade[j];
                min_index = j;
            }
        }
        System.out.println(sname[max_index] + " " + sno[max_index]);
        System.out.println(sname[min_index] + " " + sno[min_index]);
    }
}
