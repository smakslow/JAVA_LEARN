package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CD32 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        double[] d = new double[n];
        int i = 0;
        for (String s : reader.readLine().split(" ")) {
            d[i++] = Double.parseDouble(s);
        }
        reader.close();
        double max = 0;
        double temp = 1;
        for (i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                temp = temp * d[j];
                max = Math.max(max, temp);
                System.out.println(temp);
            }
            temp = 1;
        }
        System.out.println(max);
        System.out.println(String.format("%.2f",max));
    }
}
