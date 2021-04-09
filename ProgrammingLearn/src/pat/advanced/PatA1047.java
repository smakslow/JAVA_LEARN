package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class PatA1047 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        ArrayList<String>[] lists = new ArrayList[K + 1];
        for (int i = 0; i <= K; i++) {
            lists[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            str = reader.readLine().split(" ");
            for (int j = 2; j < str.length; j++) {
                int course = Integer.parseInt(str[j]);
                lists[course].add(str[0]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= K; i++) {
            sb.append(i).append(" ").append(lists[i].size()).append("\n");
            Collections.sort(lists[i]);
            for (String s : lists[i]) {
                sb.append(s).append("\n");
            }
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
