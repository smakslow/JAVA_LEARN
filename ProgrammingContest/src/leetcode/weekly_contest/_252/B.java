package leetcode.weekly_contest._252;

public class B {
    class Solution {
        public long numberOfWeeks(int[] milestones) {
            long sum = 0, max = 0;
            for (int milestone : milestones) {
                sum += milestone;
                max = Math.max(max, milestone);
            }
            if (max > sum - max + 1) return (sum - max) * 2 + 1;
            return sum;
        }
    }

}
