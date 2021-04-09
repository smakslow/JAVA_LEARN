package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing458 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int L = Integer.parseInt(str[2]);
        reader.close();
        double ori = (A + 0.0) / B;
        int a = 0;
        int b = 0;
        double del = Double.MAX_VALUE;
        for(int i = 1 ; i <= L ; i++){
            for (int j = 1; j <=L; j++) {
                double cur = i * 1.0 / j;
                if (cur >= ori && cur - ori < del){
                    del = cur - ori;
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(a +" " + b);
    }
}
