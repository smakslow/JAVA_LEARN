package com.smakslow;

import java.util.*;

/*
������ intervals ��ʾ���ɸ�����ļ��ϣ����е�������Ϊ intervals[i] = [starti, endi] ������ϲ������ص������䣬
������һ�����ص����������飬��������ǡ�ø��������е��������䡣
ʾ�� 1��
���룺intervals = [[1,3],[2,6],[8,10],[15,18]]
�����[[1,6],[8,10],[15,18]]
���ͣ����� [1,3] �� [2,6] �ص�, �����Ǻϲ�Ϊ [1,6].
ʾ��?2��
���룺intervals = [[1,4],[4,5]]
�����[[1,5]]
���ͣ����� [1,4] �� [4,5] �ɱ���Ϊ�ص����䡣

class Solution {
    public int[][] merge(int[][] intervals) {

    }
}
*/
public class Solution {
    class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return null;
        PriorityQueue<Interval> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1.start == o2.start) {
                return o1.end - o2.end;
            }
            return o1.start - o2.start;
        });
        for (int[] interval : intervals) {
            pq.offer(new Interval(interval[0], interval[1]));
        }
        List<int[]> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            Interval poll = pq.poll();
            int end = poll.end;
            while (!pq.isEmpty() && pq.peek().start <= end) {
                Interval t = pq.poll();
                end = Math.max(end, t.end);
            }
            list.add(new int[]{poll.start, end});
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] test = {{1, 4}, {2, 3}};
        /*[[1,4],[2,3]]
        [[1,3]]
        [[1,4]]
        */
        Solution solution = new Solution();
        int[][] merge = solution.merge(test);
        for (int[] ints : merge) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }
}
