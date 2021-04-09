package AtCoder.AtCoderBeginnerContest._189;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        boolean flag = false;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(i -1)) flag = true;
        }
        if(flag){
            System.out.println("Lost");
        }else {
            System.out.println("Won");
        }
    }
}
