package leetcode.weekly_contest._250;

public class B {
    class Solution {
        public int addRungs(int[] rungs, int dist) {
           int ans = 0;
           int height = 0;
            for (int rung : rungs) {
                if (height + dist < rung) {
                    ans += Math.ceil((rung - height - 1) / dist);
                }
                height = rung;
            }
            return ans;
        }
    }
}
