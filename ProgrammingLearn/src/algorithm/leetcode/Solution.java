package algorithm.leetcode;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {7, 2, 1};
        System.out.println(Arrays.toString(arrayMerge(arr1, 5, arr2, 3)));
    }

    public static int[] arrayMerge(int[] array1, int n, int[] array2, int m) {
        // write code here
        int[] res = new int[n + m];
        int i = 0, j = m - 1;
        int index = 0;
        while (i < n && j >= 0) {
            if (array1[i] < array2[j]) {
                res[index++] = array1[i++];
            } else {
                res[index++] = array2[j--];
            }
        }
        while (i < n) res[index++] = array1[i++];
        while (j >= 0) res[index++] = array2[j--];
        return res;
    }


    public int nearestValidPoint(int x, int y, int[][] points) {
        int n = points.length;
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                if (Math.abs(x - points[i][0]) + Math.abs(points[i][1] - y) < min) {
                    min = Math.abs(x - points[i][0]) + Math.abs(points[i][1] - y);
                    index = i;
                }
            }
        }
        return index;
    }

    public boolean checkOnesSegment(String s) {
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                res++;
            }
        }
        return res <= 1;
    }

    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        long x = sum - goal;
        if (x < 0) x = -x;
        int res = 0;
        if (x % limit != 0) res++;
        res += x / limit;
        return res;
    }
  class Node{
        private int age;

    }
}
