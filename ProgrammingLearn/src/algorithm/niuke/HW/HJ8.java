package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str;
        int[] count = new int[10000];
        for (int i = 0; i < n; i++) {
            str =  reader.readLine().split(" ");
            int key = Integer.parseInt(str[0]);
            int value = Integer.parseInt(str[1]);
            count[key] += value;
        }
        reader.close();
        for (int i = 0; i < 10000; i++) {
            if(count[i] != 0){
                System.out.println(i + " " + count[i]);
            }
        }
    }
}
