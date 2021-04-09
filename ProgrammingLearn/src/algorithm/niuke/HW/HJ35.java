package algorithm.niuke.HW;

import java.util.Scanner;

public class HJ35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int n = in.nextInt();
            solution(n);
        }
        in.close();
    }

    private static void solution(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            int start = (i - 1) * i / 2 + 1;
            int step = i + 1;
            for(int j = 1; j <= n - i + 1; j++){
                sb.append(start).append(" ");
                start += step;
                step ++ ;
            }
            sb.setCharAt(sb.length()-1,'\n');
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
