package leetcode.weekly_contest._253;

import java.util.PriorityQueue;

public class C {
    class Solution {
        public int minSwaps(String s) {
            char[] ch = s.toCharArray();
            PriorityQueue<Character> pq = new PriorityQueue<>();
            for (char c : ch) {
                if (pq.isEmpty()) pq.offer(c);
                else {
                    if (pq.peek() == ']') pq.poll();
                    else pq.offer(c);
                }
            }
            return pq.size();
        }
    }
}
