package noobdream.Model_Test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class F {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) throws IOException {
        String str;
        while ((str = in.readLine()) != null) {
            String[] s = str.split(" ");
            int a = 0, b = 0;
            int index = 0;
            for (int i = 0; i < s.length; i++) {
                if ("+".equals(s[i])) {
                    index = i;
                    break;
                }
            }
            int car = 0;
            for (int i = 0; i < index; i++) {
                for (int j = 0; j < number.length; j++) {
                    if (number[j].equals(s[i])) {
                        a = a * car + j;
                        car = 10;
                    }
                }
            }
            car = 0;
            for (int i = index + 1; i < s.length; i++) {
                for (int j = 0; j < number.length; j++) {
                    if (number[j].equals(s[i])) {
                        b = b * car + j;
                        car = 10;
                    }
                }
            }
            if (a + b == 0) break;
            out.println(a + b);
        }

        out.flush();
        out.close();
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(in.readLine());
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
