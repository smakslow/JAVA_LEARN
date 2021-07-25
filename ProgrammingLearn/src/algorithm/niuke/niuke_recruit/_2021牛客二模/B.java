package algorithm.niuke.niuke_recruit._2021牛客二模;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int n, k; //n个赏金猎人，k发子弹
    static int N = 100010;
    static int[] cnt = new int[N];
    static int[] ans = new int[N];

    static class Node {
        int index;
        int attack;
        int money;

        public Node(int index, int attack) {
            this.index = index;
            this.attack = attack;
        }

        public Node(int index, int attack, int money) {
            this.index = index;
            this.attack = attack;
            this.money = money;
        }
    }

    public static void main(String[] args) throws IOException {
        n = nextInt();
        k = nextInt();
        Node[] nodes = new Node[n + 1];
        for (int i = 1; i <= n; i++) {
            nodes[i] = new Node(i, nextInt());
        }
        for (int i = 1; i <= n; i++) {
            nodes[i].money = nextInt();
        }
        Arrays.sort(nodes, 1, n + 1, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.attack == o2.attack ){
                    return o1.money - o2.money;
                }
                return o1.attack - o2.attack;
            }
        });
        for (int i = 1; i <= n; i++) {
            cnt[i] = cnt[i - 1] + nodes[i].money;
        }
        for (int i = 1; i <= n; i++) {
            if (i - k > 0) {
                ans[nodes[i].index] = cnt[i] - cnt[i - k - 1];
            } else {
                ans[nodes[i].index] = cnt[i];
            }
        }
        for (int i = 1; i <= n; i++) {
            out.println(ans[i] + " ");
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
