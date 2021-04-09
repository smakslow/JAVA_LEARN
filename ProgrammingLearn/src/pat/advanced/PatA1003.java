package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PatA1003 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    public static void main(String[] args) throws IOException {



    }
    private static  String next() throws IOException {
        while(!tokenizer.hasMoreTokens()){
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return  tokenizer.nextToken();
    }
    private static int nextInt() throws IOException {
        return  Integer.parseInt(next());
    }
}
