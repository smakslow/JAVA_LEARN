package leetcode.lcp.lccup_2021_fall;

public class B {
    class Solution {
        int ans = 0;

        public int maxmiumScore(int[] cards, int cnt) {
            CalSum(cards, cnt);
            return ans;
        }

        private int lowbit(int num)
        {
            int count = 0;
            while (num != 0) {
                num = num & (num - 1);
                count++;
            }
            return count;
        }

        private void CalSum(int[] nums, int m) {
            int len = nums.length;
            int bit = 1 << len;
            for (int i = 1; i < bit; i++) {
                int sum = 0;
                if (lowbit(i) == m) {
                    for (int j = 0; j < len; j++) {
                        if ((i & 1 << j) != 0)
                            sum += nums[j];
                    }
                    if ((sum & 1) == 0) {
                        ans = Math.max(sum, ans);
                    }
                }
            }
        }
    }
}
