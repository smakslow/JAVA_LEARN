package niukecontest.xinankeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class J {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    static class Node {
        int left;
        int right;
        int flag;

        public Node(int flag, int left, int right) {
            this.flag = flag;
            this.left = left;
            this.right = right;
        }
    }

    static Node[] nodes;

    public static void main(String[] args) throws IOException {
        int T = nextInt();
        while (T-- > 0) {
            int n = nextInt();
            nodes = new Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node(i + 1, nextInt(), nextInt());
            }
            Arrays.sort(nodes, (o1, o2) -> {
                if (o1.left == o2.left) {
                    return o2.right - o1.right;
                }
                return o1.left - o2.left;
            });

            int res = 0;
            int left = 1, right = 2;
            for (int i = 1; i < n; i++) {
                if (nodes[i].right >= nodes[i - 1].right) {
                    int temp = nodes[i - 1].right - nodes[i].left;
                    if (res < temp) {
                        left = nodes[i - 1].flag;
                        right = nodes[i].flag;
                        res = temp;
                    }
                } else {
                    int temp = nodes[i].right - nodes[i].left;
                    if (res < temp) {
                        left = nodes[i - 1].flag;
                        right = nodes[i].flag;
                        res = temp;
                    }
                    nodes[i] = nodes[i - 1];
                }
            }
            out.println(res + " " + left + " " + right);
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



