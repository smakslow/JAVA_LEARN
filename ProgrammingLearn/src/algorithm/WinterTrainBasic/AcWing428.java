package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing428 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        reader.close();
        int k = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        int res = 0;
        for (int i = 0; i < 20; i++)
            if ((n >> i & 1) != 0)
                res += Math.pow(k, i);
        System.out.println(res);
    }
}
