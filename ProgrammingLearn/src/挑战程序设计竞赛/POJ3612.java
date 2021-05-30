package 挑战程序设计竞赛;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class POJ3612 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = reader.readLine();
        }
        reader.close();
        System.out.print(solve(str, n));
    }

    private static StringBuilder solve(String[] str, int n) {
        int a = 0;
        int b = n -1;
        StringBuilder sb = new StringBuilder();
        while (a <= b){
            boolean left = false;
            for (int i = 0; a + i <= b ; i++) {
                if(str[a + i].charAt(0) < str[b - i].charAt(0)){
                    left = true;
                    break;
                }else if (str[a + i].charAt(0) >str[b - i].charAt(0)){
                    left = false;
                    break;
                }
            }
            if (left) sb.append(str[a++]);
            else sb.append(str[b--]);
        }
        return  sb;
    }
}
