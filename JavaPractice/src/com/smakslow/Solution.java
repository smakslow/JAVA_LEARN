package com.smakslow;

import java.util.*;

/*
以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，
并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
示例 1：
输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
输出：[[1,6],[8,10],[15,18]]
解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
示例?2：
输入：intervals = [[1,4],[4,5]]
输出：[[1,5]]
解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。

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
