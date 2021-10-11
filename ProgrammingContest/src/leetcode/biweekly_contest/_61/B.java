package leetcode.biweekly_contest._61;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class B {
    class Solution {
        public int[] findOriginalArray(int[] changed) {
            Arrays.sort(changed);
            ArrayList<Integer> ans = new ArrayList<>();
            Queue<Integer> q = new LinkedList<>();
            for (int num : changed) {
                if (!q.isEmpty() && num == q.peek()) {
                    q.poll();
                } else {
                    ans.add(num);
                    q.offer(num * 2);
                }
            }
            return q.isEmpty() ? ans.stream().mapToInt(Integer::intValue).toArray() : new int[]{};
        }
    }
}
