package leetcode._2021spring;

import java.util.PriorityQueue;

public class C {
    class Solution {
        public int magicTower(int[] nums) {
            long s = 1;
            for (int num : nums) {
                s += num;
            }
            if (s <= 0) return -1;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            s = 1;
            int res = 0;
            for (int num : nums) {
                if (num < 0) pq.offer(num);
                s += num;
                while (s <= 0) {
                    if (!pq.isEmpty()) {
                        s -= pq.poll();
                        res++;
                    }
                }
            }
            return res;
        }
    }
}
