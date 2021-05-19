package leetcode.weekly_contest._241;

import java.util.HashMap;

public class C {
    class FindSumPairs {
        int[] nums1;
        int[] nums2;
        HashMap<Integer, Integer> map;

        public FindSumPairs(int[] nums1, int[] nums2) {
            this.nums1 = nums1;
            this.nums2 = nums2;
            map = new HashMap<>();
            for (int num : nums2) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        public void add(int index, int val) {
            map.put(nums2[index], map.getOrDefault(nums2[index], 0) - 1);
            nums2[index] += val;
            map.put(nums2[index], map.getOrDefault(nums2[index], 0) + 1);
        }

        public int count(int tot) {
            int ans = 0;
            for (int num : nums1) {
                if (map.containsKey(tot - num)) {
                    ans += map.get(tot - num);
                }
            }
            return ans;
        }
    }
}
