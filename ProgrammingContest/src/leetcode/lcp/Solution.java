package leetcode.lcp;


import java.util.*;

public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        for (int[] p : points) {
            Map<Integer, Integer> cnt = new HashMap<>();
            for (int[] q : points) {
                int dis = (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
                cnt.put(dis, cnt.getOrDefault(dis, 0) + 1);
            }
            for (int value : cnt.values()) {
                ans += value * (value - 1);
            }
        }
        return ans;
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length(), m = s2.length(), t = s3.length();
        if (n + m != t) return false;
        int i = 0, j = 0, k = 0;
        while (i < n || j < m) {
            if (i < n && s1.charAt(i) == s3.charAt(k)) {
                i++;
                k++;
            } else if (j < m && s2.charAt(j) == s3.charAt(k)) {
                j++;
                k++;
            } else {
                return false;
            }
        }
        return k == t;
    }
}
