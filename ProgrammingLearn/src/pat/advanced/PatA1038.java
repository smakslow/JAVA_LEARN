package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PatA1038 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        String[] s = new String[n];
        System.arraycopy(str, 1, s, 0, n);
        reader.close();
        Arrays.sort(s,(a, b)-> (a + b).compareTo(b + a));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s[i]);
        }
        String  res = sb.toString();
        int index = 0;
        for (int i = 0; i < res.length(); i++) {
            if(res.charAt(i)== '0') index++;
            else break;
        }
        System.out.println(res.substring(index));
    }
}
