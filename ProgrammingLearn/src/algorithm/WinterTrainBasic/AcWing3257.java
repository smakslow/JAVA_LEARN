package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

}

public class AcWing3257 {
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int num, pre = 0, res = 0;
        while ((num = Reader.nextInt()) != 0) {
            if (num == 2) {
                pre += 2;
                res += pre;
            }
            else if (num == 1) {
                res += 1;
                pre = 0;
            }
        }
        System.out.println(res);
    }
}
