package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD39 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        boolean[] arr = new boolean[n];
        String[] str = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
           arr[Integer.parseInt(str[i])] = true;
        }
        reader.close();
        for (int i = 0; i < n; i++) {
            if( !arr[i]){
                System.out.println(i);
                return;
            }
        }
    }
}
