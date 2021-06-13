package leetcode.weekly_contest._245;

import java.util.PriorityQueue;

public class C {
    class Solution {
        class Triplet {
            int a, b, c;

            public Triplet(int a, int b, int c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
        }

        public boolean mergeTriplets(int[][] triplets, int[] target) {
            PriorityQueue<Triplet> t = new PriorityQueue<>((o1, o2) -> {
                if (o1.a == o2.a) {
                    if (o1.b == o2.b) {
                        return o2.c - o1.c;
                    }
                    return o2.b - o1.b;
                }
                return o2.a - o1.a;
            });
            for (int[] triplet : triplets) {
                if(triplet[0] <= target[0] && triplet[1] <= target[1] && triplet[2] <= target[2])
                    t.offer(new Triplet(triplet[0], triplet[1], triplet[2]));
            }
            while(!t.isEmpty()){
                Triplet triplet = t.poll();
                if(triplet.a == target[0] && triplet.b == target[1]  && target[2] == triplet.c) return true;
                if(!t.isEmpty()){
                    Triplet poll = t.poll();
                    t.offer(new Triplet(Math.max(triplet.a,poll.a),Math.max(triplet.b,poll.b),Math.max(triplet.c,poll.c)));
                }
            }
            return false;
        }
    }
}
