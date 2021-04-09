package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1116 {
    static int N = 10010;
    static  int[] arr = new int[N];
    static boolean[] vis = new boolean[N];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int index = 1;
        for (int i = 0; i < n; i++) {
              arr[Integer.parseInt(reader.readLine())] = index;
              index++;
        }
        reader.close();
        int k = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            n = Integer.parseInt(reader.readLine());
            if(arr[n] != 0){
                if(vis[n]){
                    
                }
            }
        }
    }
}
