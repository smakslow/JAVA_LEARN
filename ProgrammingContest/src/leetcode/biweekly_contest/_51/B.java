package leetcode.biweekly_contest._51;

import java.util.PriorityQueue;

public class B {
    class SeatManager {
        PriorityQueue<Integer> pq;
        int[] flag;

        public SeatManager(int n) {
            pq = new PriorityQueue<>(n);
            flag = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                pq.add(i);
            }
        }

        public int reserve() {
            int poll = 0;
            if (!pq.isEmpty()) {
                poll = pq.poll();
                flag[poll] = 1;
            }
            return poll;
        }

        public void unreserve(int seatNumber) {
            flag[seatNumber] = 0;
            pq.offer(seatNumber);
        }
    }
}
