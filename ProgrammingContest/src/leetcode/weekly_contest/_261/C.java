package leetcode.weekly_contest._261;

public class C {
    class Solution {
        public boolean stoneGameIX(int[] stones) {
            int zero = 0, one = 0, two = 0;
            for (int stone : stones) {
                if (stone % 3 == 0) zero++;
                else if (stone % 3 == 1) one++;
                else two++;
            }
            return false;
        }

    }
}
