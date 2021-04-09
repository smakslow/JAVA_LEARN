package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] string = reader.readLine().split(" ");
        int n = Integer.parseInt(string[0]);
        int m = Integer.parseInt(string[1]);
        int k = Integer.parseInt(string[2]);
        for (int i = 0; i < n; i++) {
            string = reader.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                if (Integer.parseInt(string[j]) == (k)) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        reader.close();
        System.out.println("No");
    }
}
