package leetcode.weekly_contest._259;

public class C {
    class DetectSquares {
        final int n = 1001;
        int[][] p;

        public DetectSquares() {
            p = new int[n][n];
        }

        public void add(int[] point) {
            p[point[0]][point[1]]++;
        }

        public int count(int[] point) {
            int ans = 0;
            int x = point[0], y = point[1];
            for (int i = x + 1, j = y + 1; i < n && j < n; i++, j++) {
                ans += p[i][y] * p[x][j] * p[i][j];
            }
            for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
                ans += p[i][y] * p[x][j] * p[i][j];
            }
            for (int i = x + 1, j = y - 1; i < n && j >= 0; i++, j--) {
                ans += p[i][y] * p[x][j] * p[i][j];
            }
            for (int i = x - 1, j = y + 1; i >= 0 && j < n; i--, j++) {
                ans += p[i][y] * p[x][j] * p[i][j];
            }
            return ans;
        }
    }
}
