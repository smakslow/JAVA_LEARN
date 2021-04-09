package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class PatA1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        reader.close();
        int num;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            num = 0;
            for (int j = 0; j < str[i].length(); j++) {
                num += str[i].charAt(j) - '0';
            }
            set.add(num);
        }
        StringBuilder sb = new StringBuilder();
        for(int number : set){
            sb.append(number).append(" ");
        }
        System.out.println(set.size());
        System.out.println(sb.substring(0,sb.length() - 1));
    }
}
