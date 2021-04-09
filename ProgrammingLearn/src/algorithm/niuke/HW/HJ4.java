package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class HJ4 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str;
        while((str = reader.readLine())!=null){
            int len = str.length();
            int start = 0;
            while (len >= 8){
                out.println(str.substring(start, start + 8));
                start += 8;
                len -= 8;
            }
            if (len > 0) {
                char[] tmp = new char[8];
                Arrays.fill(tmp,'0');
                for(int i = 0; start < str.length(); i++) {
                    tmp[i] = str.charAt(start++);
                }
                out.println(String.valueOf(tmp));
            }
        }
        reader.close();
        out.flush();
        out.close();
    }
}
