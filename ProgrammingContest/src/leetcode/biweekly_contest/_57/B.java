package leetcode.biweekly_contest._57;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class B {
    class Solution {
        class Seat{
            int idx;
            int seat;
            int start;
            int end;

            public Seat(int idx,int seat, int start, int end) {
                this.idx = idx;
                this.seat = seat;
                this.start = start;
                this.end = end;
            }
        }
        public int smallestChair(int[][] times, int targetFriend) {
            int n  = times.length;
            Seat[] seats = new Seat[n];
            for (int i = 0; i < n; i++) {
                seats[i] = new Seat(i,-1,times[i][0],times[i][1]);
            }
            Arrays.sort(seats, Comparator.comparingInt(o -> o.start));
            PriorityQueue<Integer> freeing = new PriorityQueue<>();
            PriorityQueue<Seat> using = new PriorityQueue<>(Comparator.comparingInt(o -> o.end));
            for (int i = 0; i < n; i++) {
                freeing.offer(i);
            }
            for (int i = 0; i < n; i++) {
                while (!using.isEmpty() && using.peek().end <= seats[i].start) {
                    freeing.offer(using.poll().seat);
                }
                if (targetFriend == seats[i].idx) return  freeing.poll();
                using.offer(new Seat(i,freeing.poll(),seats[i].start,seats[i].end));
            }
            return -1;
        }
    }
}
