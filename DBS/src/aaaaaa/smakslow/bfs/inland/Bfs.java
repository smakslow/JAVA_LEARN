package aaaaaa.smakslow.bfs.inland;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Bfs {
    class ListNode {
        int x, y;

        public ListNode(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static final int maxn = 1000;
    static int n, m;
    static int[][] matrix = new int[maxn][maxn];
    static boolean[][] inq = new boolean[maxn][maxn];
    static int[] X = {0, 0, -1, 1};
    static int[] Y = {1, -1, 0, 0};

    private boolean judge(int x, int y) {
        //越界错误
        if (x >= n || x < 0 || y >= m || y < 0)
            return false;
        //当前位置为0 或 （x,y）已经入队
        if (matrix[x][y] == 0 || inq[x][y]) return false;
        return true;
    }

    void Bfs(int x, int y) {
        Queue<ListNode> queue = new LinkedList<>();
        queue.offer(new ListNode(x, y));
        inq[x][y] = true;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = node.x + X[i];
                int newY = node.y + Y[i];
                if (judge(newX, newY)) {
                    queue.offer(new ListNode(newX, newY));
                    inq[newX][newY] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                matrix[x][y] = scanner.nextInt();
            }
        }
    }
}
