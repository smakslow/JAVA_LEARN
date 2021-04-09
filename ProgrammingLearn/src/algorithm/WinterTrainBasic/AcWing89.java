package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing89 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        long a = Long.parseLong(str[0]);
        int b = Integer.parseInt(str[1]);
        int p = Integer.parseInt(str[2]);
        long res = 1 % p;
        while (b != 0) {
            if ((b & 1) != 0) res = res * a % p;
            a = a * a % p;
            b >>= 1;
        }
        System.out.println(res);
    }
}
