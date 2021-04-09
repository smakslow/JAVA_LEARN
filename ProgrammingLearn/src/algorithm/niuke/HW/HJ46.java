package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ46 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = reader.readLine()) != null){
            int k = Integer.parseInt(reader.readLine());
            System.out.println(str.substring(0,k));
        }
    }

    private static String subStr(String str,int k){
        char[] temp = new char[k];
        for(int i = 0;i < k ;i++){
            temp[i] = str.charAt(i);
        }
        return new String(temp);
    }
}
