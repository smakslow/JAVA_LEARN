package leetcode.biweekly_contest._52;

public class C {
    class Solution {
        public char[][] rotateTheBox(char[][] box) {
            int n = box.length;
            int m = box[0].length;
            char[][] ans = Rotation(box, n, m);
            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    int temp = j;
                    if (ans[j][i] == '#') {
                        while (temp < m - 1 && ans[temp + 1][i] == '.') {
                            temp++;
                        }
                        char c = ans[j][i];
                        ans[j][i] = ans[temp][i];
                        ans[temp][i] = c;
                    }

                }
            }
            return ans;
        }

        private char[][] Rotation(char[][] arr, int ROW, int COL) {
            char[][] tmp = new char[COL][ROW];
            int dst = ROW - 1;
            //Ë³Ê±ÕëÐý×ª¾ØÕó90¶È
            for (int i = 0; i < ROW; i++, dst--)
                for (int j = 0; j < COL; j++)
                    tmp[j][dst] = arr[i][j];
            return tmp;
        }
    }


}
