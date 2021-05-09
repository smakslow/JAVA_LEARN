package niukecontest._2021Trainning8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class G {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {


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