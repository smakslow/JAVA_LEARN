package leetcode.weekly_contest._253;

import java.util.PriorityQueue;

public class B {
    class Solution {
        public int minStoneSum(int[] piles, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
            for (int pile : piles) {
                pq.offer(pile);
            }
            while (k-- > 0) {
                int a = pq.poll();
                pq.offer(a - (a / 2));
            }
            int ans = 0;
            while (pq.size() > 0) {
                ans += pq.poll();
            }
            return ans;
        }
    }
}
