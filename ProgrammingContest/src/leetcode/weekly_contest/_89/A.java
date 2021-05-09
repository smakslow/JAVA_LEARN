package leetcode.weekly_contest._89;

public class A {
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            for (int i = 1; i < arr.length - 1; i++) {
                int left = i;
                int right = i;
                while(left > 0 && arr[left] > arr[left - 1]){
                    left --;
                }
                while (right + 1< arr.length && arr[right] > arr[right + 1]){
                    right++;
                }
                if(left == 0 && right == arr.length - 1) return i;
            }
            return -1;
        }
    }
}
