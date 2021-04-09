package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1041 {
    static int N = 100001;
    static int arr[] = new int[N];
    static int count[] = new int[N];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        for (int i = 1; i <= n; i++) {
            int temp =Integer.parseInt(str[i]);
            arr[i] = temp;
            count[temp]++;
        }
        for (int i = 1; i <= n; i++) {
            if(count[arr[i]] == 1){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("None");
    }
}
