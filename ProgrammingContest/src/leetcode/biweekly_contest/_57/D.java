package leetcode.biweekly_contest._57;

import java.util.ArrayDeque;
import java.util.Deque;

public class D {
    class Solution {
        public int[] canSeePersonsCount(int[] heights) {
            int n = heights.length;
            int[] ans = new int[n];
            Deque<Integer> dq = new ArrayDeque<>(n);
            for (int i = n - 1; i >= 0; i--) {
                int h = heights[i];
                int pop = 0;
                while (!dq.isEmpty() && dq.peekFirst() <= h) {
                    pop++;
                    dq.removeFirst();
                }
                if (!dq.isEmpty()) {
                    pop++;
                }
                ans[i] = pop;
                dq.addFirst(h);
            }
            return ans;
        }
    }
}
