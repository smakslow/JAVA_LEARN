package algorithm.niuke.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HJ29 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        String target, encoded;
        while ((target = reader.readLine()) != null) {
            encoded = reader.readLine();
            StringBuilder sb1 = new StringBuilder();
            for (int i = 0; i < target.length(); i++) {
                char c = target.charAt(i);
                if (Character.isUpperCase(c)) {
                    if (c < 'Z') {
                        sb1.append(Character.toLowerCase((char) (c + 1)));
                    } else {
                        sb1.append('a');
                    }
                }
                if (Character.isLowerCase(c)) {
                    if (c < 'z') {
                        sb1.append(Character.toUpperCase((char) (c + 1)));
                    } else {
                        sb1.append('A');
                    }
                }
                if (Character.isDigit(c)) {
                    int a = c - '0';
                    if (c < 9) sb1.append(a + 1);
                    else sb1.append(0);
                }
            }
            out.println(sb1.toString());
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < encoded.length(); i++) {
                char c = encoded.charAt(i);
                if (Character.isUpperCase(c)) {
                    if (c > 'A') {
                        sb2.append(Character.toLowerCase((char) (c - 1)));
                    } else {
                        sb2.append('z');
                    }
                }
                if (Character.isLowerCase(c)) {
                    if (c > 'a') {
                        sb2.append(Character.toUpperCase((char) (c - 1)));
                    } else {
                        sb2.append('Z');
                    }
                }
                if (Character.isDigit(c)) {
                    int a = c - '0';
                    if (c > 0) sb1.append(a - 1);
                    else sb2.append(9);
                }
            }
            out.println(sb2.toString());
        }

        out.flush();
        out.close();
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}
