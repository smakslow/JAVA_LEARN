package leetcode.weekly_contest._244;

public class A {
    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            int n = mat.length;
            boolean flag = true;
            for (int i = 0; i < 4; i++) {
                int[][] rotation = Rotation(mat, n, n);
                flag = true;
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (target[j][k] != rotation[j][k]) {
                            flag = false;
                            break;
                        }
                    }
                    if (!flag) break;
                }
                if (flag) return flag;
                mat = rotation;
            }
            return flag;
        }

        private int[][] Rotation(int[][] arr, int ROW, int COL) {
            int[][] tmp = new int[COL][ROW];
            int dst = ROW - 1;
            //Ë³Ê±ÕëÐý×ª¾ØÕó90¶È
            for (int i = 0; i < ROW; i++, dst--)
                for (int j = 0; j < COL; j++)
                    tmp[j][dst] = arr[i][j];
            return tmp;
        }
    }
}
