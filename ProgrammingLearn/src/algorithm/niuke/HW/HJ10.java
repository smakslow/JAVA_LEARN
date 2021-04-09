package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ10 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str = reader.readLine();
        reader.close();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        boolean[] b = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            b[str.charAt(i)] = true;
        }
        int res = 0;
        for (int i = 0; i < 128; i++) {
            if(b[i]) res++;
        }
        return  res;
    }

}
