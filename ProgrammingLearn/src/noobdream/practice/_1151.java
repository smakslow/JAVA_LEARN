package noobdream.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _1151 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static class Student {
        String name;
        int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int flag = nextInt();
        Student[] s= new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student(next(),nextInt());
        }
        if(flag == 1){
            Arrays.sort(s,(Comparator.comparingInt(o -> o.score)));
        }
        if(flag == 0){
            Arrays.sort(s,((o1, o2) -> o2.score - o1.score));
        }
        for (int i = 0; i < n; i++) {
            out.println(s[i].name + " " + s[i].score);
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
