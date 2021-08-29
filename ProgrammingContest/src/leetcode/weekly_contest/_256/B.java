package leetcode.weekly_contest._256;

import java.util.Arrays;
import java.util.Comparator;

public class B {
    static class Solution {
        public String kthLargestNumber(String[] nums, int k) {
            Arrays.sort(nums, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (o1.length() == o2.length()) {
                        return (o1).compareTo(o2);
                    }
                    return o1.length() - o2.length();
                }
            });
            System.out.println(Arrays.toString(nums));
            return nums[nums.length - k];
        }
    }

    public static void main(String[] args) {
        String[] str = {"3", "6", "7", "10"};
        String s = new Solution().kthLargestNumber(str, 4);
        System.out.println(s);
    }
}
