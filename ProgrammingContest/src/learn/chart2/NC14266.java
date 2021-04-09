package learn.chart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NC14266 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    static class Computer {
        int mem;
        int speed;

        Computer(int mem, int speed) {
            this.mem = mem;
            this.speed = speed;
        }
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        Computer[] computers = new Computer[n];
        for (int i = 0; i < n; i++) {
            computers[i] = new Computer(nextInt(), nextInt());
        }
        Arrays.sort(computers, (o1, o2) -> {
            if(o1.speed == o2.speed){
                return o1.mem - o2.mem;
            }
            return o1.speed - o2.speed;
        });
        int res = 0;
        int max = computers[0].speed;
        for (int i = 1; i < n; i++) {
            if (computers[i].speed > max) {
                res++;
                max = computers[i].speed;
            }
        }
        out.println(res);
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
