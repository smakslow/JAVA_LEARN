package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1067 {
    static  int N = 10010;
    static int[] arr = new int[N];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        String[] str = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(str[i])] = i;
        }
        int res=  0;
        for (int i = 0; i < n;) {
            while(arr[0] != 0){
                swap(arr[0],arr[arr[0]]);
                res++;
            }
            while (i < n && arr[i] == i) i++;
            if(i < n) {
                swap(arr[0],arr[i]);
                res++;
            }
        }

    }
    private static void swap(int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
