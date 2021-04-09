package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class PatA1091 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int M, N, L, T;
    static int[][][] arr;
    static int[][] dir = new int[][]{
            {1, 0, 0},
            {-1, 0, 0},
            {0, 1, 0},
            {0, -1, 0},
            {0, 0, 1},
            {0, 0, -1},
    };

    public static void main(String[] args) throws IOException {
        M = nextInt();
        N = nextInt();
        L = nextInt();
        T = nextInt();
        arr = new int[L][M][N];
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    arr[i][j][k] = nextInt();
                }
            }
        }
        reader.close();
        int res = 0;
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (arr[i][j][k] == 1) {
                        int t = bfs(i, j, k);
                        if (t >= T) res += t;
                    }
                }
            }
        }
        System.out.println(res);
    }

    private static int bfs(int i, int j, int k) {
        LinkedList<Node> nodes = new LinkedList<>();
        nodes.offer(new Node(i, j, k));
        arr[i][j][k] = 0;
        int count = 1;
        Node node;
        while (!nodes.isEmpty()) {
            node = nodes.poll();
            for (int l = 0; l < 6; l++) {
                int dx = node.x + dir[l][0];
                int dy = node.y + dir[l][1];
                int dz = node.z + dir[l][2];
                if (dx >= 0 && dx < L && dy >= 0 && dy < M && dz >= 0 && dz < N && arr[dx][dy][dz] == 1) {
                    arr[dx][dy][dz] = 0;
                    count++;
                    nodes.offer(new Node(dx, dy, dz));
                }
            }
        }
        return count;
    }

    private static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static class Node {
        int x, y, z;

        Node(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
