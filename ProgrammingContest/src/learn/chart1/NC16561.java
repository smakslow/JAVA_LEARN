package learn.chart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NC16561 {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    static class Node {
        int left;
        int right;

        public Node(int a, int b) {
            left = a;
            right = b;
        }
    }

    static Node[] nodes;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int a = nextInt();//国王左手
        int b = nextInt();//国王右手
        nodes = new Node[n];
        for (int i = 1; i <= n; i++) {
            nodes[i] = new Node(nextInt(), nextInt());
        }
        Arrays.sort(nodes, (o1, o2) -> {
            if (o1.left * o1.right == o2.left * o2.right) {
                return o2.right - o1.right;
            }
            return o1.left * o1.right - o2.left * o2.right;
        });
        int start = a;
        int res = b;
        for (Node node : nodes) {
            res = Math.max(res, (int) Math.floor(start / node.right));
            start += node.left;
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
