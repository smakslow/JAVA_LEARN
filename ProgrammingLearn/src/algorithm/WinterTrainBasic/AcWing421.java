package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing421 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str =reader.readLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int h = Integer.parseInt(reader.readLine()) + 30;
        reader.close();
        int res = 0;
        for (int i = 0; i < str.length; i++) {
            if(arr[i] <= h) res++;
        }
        System.out.println(res);
    }
}
