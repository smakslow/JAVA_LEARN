package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1014 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);//窗口总数
        int m = Integer.parseInt(str[1]);//黄线内最大人数
        int k = Integer.parseInt(str[2]);//客户总数
        int q = Integer.parseInt(str[3]);//询问人数
        int[] arr =new int[k];
        str = reader.readLine().split(" ");
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < q; i++) {

        }
    }
}
