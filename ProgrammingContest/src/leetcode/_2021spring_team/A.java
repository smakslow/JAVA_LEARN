package leetcode._2021spring_team;

import java.util.Comparator;
import java.util.PriorityQueue;

public class A {
    static class Solution {
        static class Node {
            int x;
            int y;
            int w;

            Node(int x, int y) {
                this.x = x;
                this.y = y;
                this.w =  (int)Math.ceil(y / x);
            }
        }

        public static int storeWater(int[] bucket, int[] vat) {
            int n = bucket.length;
            PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingDouble(o -> o.w));
            int ans = 0;
            int x = 0;
            for (int i = 0; i < n; i++) {
                if (bucket[i] == 0) {
                    bucket[i]++;
                    ans++;
                }
                if (vat[i] == 0) {
                    continue;
                }
                pq.offer(new Node(bucket[i], vat[i]));
            }
            while (!pq.isEmpty()) {
                Node poll = pq.poll();
                if(poll.w == x) continue;
                poll.x++;
                poll.w = poll.y / poll.x;
                ans++;
                pq.offer(poll);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] a = {9, 0, 1};
        int[] b = {0, 2, 2};
        System.out.println(Solution.storeWater(a, b));
    }
}
