package leetcode.lcp.lccup_2021_fall;

import java.util.Arrays;

public class LCP28 {
    class Solution {
        public int purchasePlans(int[] nums, int target) {
            int MOD = 1000000007;

            Arrays.sort(nums);

            int ans = 0;

            int left = 0;
            int right = nums.length - 1;

            int d = right;

            while (left < right) {
                if (nums[left] + nums[right] <= target) {
                    ans = (ans + d) % MOD;
                    left++;
                } else {
                    right--;
                }
                d--;
            }
            return ans;
        }
    }


    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
        int ans = -1;
        for (int i = 0; i < s.length; i++) {
            if (s[i].startsWith(searchWord)) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
