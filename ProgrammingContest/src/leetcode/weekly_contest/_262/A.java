package leetcode.weekly_contest._262;

import java.util.ArrayList;
import java.util.List;

public class A {
    class Solution {
        final int n = 110;

        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            List<Integer> ans = new ArrayList<>();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            for (int i : nums1) {
                a[i] = 1;
            }
            for (int i : nums2) {
                b[i] = 1;
            }
            for (int i : nums3) {
                c[i] = 1;
            }
            for (int i = 0; i < n; i++) {
                if (a[i] + b[i] + c[i] >= 2) ans.add(i);
            }
            return ans;
        }
    }
}
