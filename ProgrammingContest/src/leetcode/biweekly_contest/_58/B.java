package leetcode.biweekly_contest._58;

public class B {
    class Solution {
        char[][] b;
        int r, c;

        public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
            b = board;
            r = rMove;
            c = cMove;
            b[rMove][cMove] = color;
            return dfs(b, rMove, cMove, color, 0);
        }

        private boolean dfs(char[][] b, int rMove, int cMove, char color, int cnt) {
            if ((rMove == 0 || rMove == 7 || cMove == 0 || cMove == 7) && cnt == 2) {
                return true;
            }

            return false;
        }
    }
}
