package leetcode.biweekly_contest._51;

import java.util.Comparator;
import java.util.PriorityQueue;

public class D {
    class Solution {
        class Room {
            int id;
            int size;

            public Room(int id, int size) {
                this.id = id;
                this.size = size;
            }
        }

        public int[] closestRoom(int[][] rooms, int[][] queries) {
            int n = rooms.length;
            PriorityQueue<Room> small = new PriorityQueue<>(new Comparator<Room>() {
                @Override
                public int compare(Room o1, Room o2) {
                    if (o1.size == o2.size) {
                        return o1.id - o2.id;
                    }
                    return o1.size - o2.size;
                }
            });
            PriorityQueue<Room> big = new PriorityQueue<>(new Comparator<Room>() {
                @Override
                public int compare(Room o1, Room o2) {
                    if (o1.size == o2.size) {
                        return o1.id - o2.id;
                    }
                    return o2.size - o1.size;
                }
            });

            int k = queries.length;
            int[] ans = new int[k];
            for (int i = 0; i < k; i++) {
                int prefer = queries[i][0];
                int min = queries[i][1];
                while (!big.isEmpty() && big.peek().size >= min) {
                    small.offer(big.poll());
                }
                while ((!small.isEmpty() && small.peek().size < min)) {
                    big.offer(small.poll());
                }
                if (small.isEmpty()) {
                    ans[i] = -1;
                    continue;
                }
                int t = Integer.MAX_VALUE;
                while (!small.isEmpty()) {
                    t = Math.min(t, Math.abs(small.poll().id - prefer));
                }
                ans[i] = t;
            }
            return ans;
        }

        public int downK(Room[] a, int key) {
            int low = 0, high = a.length - 1;
            while (low < high) {
                int mid = (low + high) >> 1;
                if (a[mid].size < key) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            if (a[high].size >= key) {
                return high;
            } else {
                return -1;
            }
        }
    }
}
