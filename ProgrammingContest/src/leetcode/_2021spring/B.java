package leetcode._2021spring;

public class B {
    class Solution {
        public int orchestraLayout(int num, int xPos, int yPos) {
            return dfs(num, xPos + 1, yPos + 1);
        }

        public int dfs(int n, int x, int y) {
            int up = x, down = n - x + 1, left = y, right = n - y + 1;

            int t = Math.min(Math.min(up, down), Math.min(left, right));

            int ans = 1, r = 1, c = 1;
            for (int i = 1; i < t; i++) {
                ans += 4 * n - 4;
                r++;
                c++;
                n -= 2;
            }
            if (x == r) ans += y - c;
            else if (y == c + n - 1) ans += n - 1 + x - r;
            else if (x == r + n - 1) ans += 3 * n - 3 - (y - c);
            else ans += 4 * n - 4 - (x - r);
            return ans;
        }
    }


}
