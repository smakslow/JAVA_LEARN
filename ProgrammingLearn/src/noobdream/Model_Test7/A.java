package noobdream.Model_Test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class A {
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
        Student[] stu = new Student[n];
        for (int i = 0; i < n; i++) {
            stu[i] = new Student(next(), nextInt());
        }
        if (flag == 1)  Arrays.sort(stu, Comparator.comparingInt(o -> o.score));
         else Arrays.sort(stu, (o1, o2) -> Integer.compare(o2.score, o1.score));
        for (int i = 0; i < n; i++) {
            out.println(stu[i].name +" " + stu[i].score);
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
