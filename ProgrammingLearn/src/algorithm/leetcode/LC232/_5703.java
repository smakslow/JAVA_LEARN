package algorithm.leetcode.LC232;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _5703 {
    class Solution {
        class X {
            int n;
            int fre;

            public X(int n, int fre) {
                this.n = n;
                this.fre = fre;
            }
        }

        public int[] frequencySort(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            PriorityQueue<X> pq = new PriorityQueue<>((o1, o2) -> {
                if (o1.fre == o2.fre) {
                    return o2.n - o1.n;
                }
                return o1.fre - o2.fre;
            });
            int n = nums.length, ind = 0;
            int[] ans = new int[n];
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                pq.offer(new X(entry.getKey(), entry.getValue()));
            }
            while (!pq.isEmpty()) {
                X x = pq.poll();
                for (int i = 0; i < x.fre; i++) {
                    ans[ind++] = x.n;
                }
            }
            return ans;
        }
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Node> nodes = new PriorityQueue<>((v1, v2) -> Double.compare(v2.v, v1.v));
//            PriorityQueue<String[]> strings = new PriorityQueue<>((o1, o2) -> {
//                if(o1[0].equals(o2[0])){
//                    return o1[1].compareTo(o2[1]);
//                }
//                return o1[0].compareTo(o2[0]);
//            });
        double sum = 0;
        for (int[] aClass : classes) {
            int a = aClass[1];
            int b = aClass[0];
            sum += (double) b / a;
            nodes.offer(new Node((a - b) / (a * (a + 1.0)), a, b));
        }
        while (extraStudents-- > 0) {
            Node t = nodes.poll();
            sum += t.v;
            int a = t.a + 1;
            int b = t.b + 1;
            nodes.offer(new Node((a - b) / (a * (a + 1.0)), a, b));
        }
        return sum / classes.length;
    }

    class Node {
        double v;
        int a, b;

        public Node(double v, int a, int b) {
            this.a = a;
            this.b = b;
            this.v = v;
        }
    }
    
}
