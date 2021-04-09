package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD73 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int i = 0, j = str.length() - 1;
        boolean flag = false;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = true;
                break;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
