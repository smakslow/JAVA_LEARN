package learn.chart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NC14583 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int[] team = new int[50010];
    static int[] capacity = new int[50010];
    static int[] time = new int[50010];
    static int[] max = new int[2];

    public static void main(String[] args) throws IOException {
        int T = nextInt();
        while (T-- > 0) {
            int n = nextInt();
            int m = nextInt();
            for (int i = 1; i <= n; i++) {
                team[i] = nextInt();
                capacity[i] = nextInt();
            }
            for (int i = 1; i <= m; i++) {
                time[nextInt()]++;
            }
            max[team[n]] = capacity[n] + time[n];
            max[team[n] ^ 1] = 0;
            int cnt = 1;
            for (int i = n - 1; i != 0; i--) {
                time[i] += time[i + 1];
                if (time[i] + capacity[i] >= max[team[i] ^ 1]) cnt++;
                max[team[i]] = Math.max(team[i], time[i] + capacity[i]);
            }
            out.println(cnt);
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
