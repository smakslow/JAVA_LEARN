package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AcWing1532 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int amount = Integer.parseInt(str[1]);
        str = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        int i = 0, j = n - 1;
        int temp;
        while (i < j) {
            temp = arr[i] + arr[j];
            if (temp == amount) {
                System.out.println(arr[i] + " " + arr[j]);
                return;
            } else if (temp > amount){
                j--;
            }else {
                i++;
            }
        }
        System.out.println("No Solution");

    }
}
