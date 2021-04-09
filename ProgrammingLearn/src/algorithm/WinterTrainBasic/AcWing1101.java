package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class AcWing1101 {
    private static int startX, startY;//Æğµã
    private static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int row, col;
        String[] s;
        String str;
        char[][] arr;
        char temp;
        while (n-- > 0) {
            s = reader.readLine().split(" ");
            row = Integer.parseInt(s[0]);
            col = Integer.parseInt(s[1]);
            arr = new char[row][col];
            for (int i = 0; i < row; i++) {
                str = reader.readLine();
                for (int j = 0; j < col; j++) {
                    temp = str.charAt(j);
                    arr[i][j] = temp;
                    if (temp == 'S') {
                        startX = i;
                        startY = j;
                    }
                }
            }
            solution(arr, row, col);
        }
        reader.close();
    }

    private static void solution(char[][] arr, int row, int col) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        int[][] dis = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                dis[i][j] = -1;
            }
        }
        dis[startX][startY] = 0;
        while (!queue.isEmpty()) {
            int[] axis = queue.poll();
            for (int i = 0; i < 4; i++) {
                int a = axis[0] + dx[i], b = axis[1] + dy[i];
                if (judge(a, b) && arr[a][b] != '#' && dis[a][b] == -1) {
                    dis[a][b] = dis[axis[0]][axis[1]] + 1;
                    System.out.println(dis[a][b]);
                    if (arr[a][b] == 'E') {
                        System.out.println(dis[a][b]);
                        return;
                    }
                    queue.add(new int[]{a, b});
                }

            }
        }
        System.out.println("oop!");
    }

    private static boolean judge(int row, int col) {
        return startX >= 0 && startX < row && startY >= 0 && startY < col;
    }
}
