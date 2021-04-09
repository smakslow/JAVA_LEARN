package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing3232 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        reader.close();
        int res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(res, Math.abs(Integer.parseInt(str[i]) - Integer.parseInt(str[i - 1])));
        }
        System.out.println(res);
    }
}
