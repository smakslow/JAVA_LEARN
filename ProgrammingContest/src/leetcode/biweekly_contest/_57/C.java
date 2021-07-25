package leetcode.biweekly_contest._57;

import java.util.*;

public class C {
    class Solution {
        public List<List<Long>> splitPainting(int[][] segments) {
            int[][] sortedL = segments.clone();
            int[][] sortedR = segments.clone();
            Arrays.sort(sortedL, Comparator.comparingInt(x -> x[0]));
            Arrays.sort(sortedR, Comparator.comparingInt(x -> x[1]));
            int lIter = 0;
            int rIter = 0;
            int n = segments.length;
            List<List<Long>> ans = new ArrayList<>();
            long sum = 0;
            long last = -1;
            while (lIter < n || rIter < n) {
                long next = sortedR[rIter][1];
                if (lIter < n) {
                    next = Math.min(next, sortedL[lIter][0]);
                }
                if (last >= 0 && sum > 0) {
                    ans.add(Arrays.asList(last, next, sum));
                }
                last = next;
                while (rIter < n && sortedR[rIter][1] == next) {
                    sum -= sortedR[rIter++][2];
                }
                while (lIter < n && sortedL[lIter][0] == next) {
                    sum += sortedL[lIter++][2];
                }
            }
            return ans;
        }
    }

}
