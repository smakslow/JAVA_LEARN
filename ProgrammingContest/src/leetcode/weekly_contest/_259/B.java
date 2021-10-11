package leetcode.weekly_contest._259;

public class B {
    class Solution {
        public int sumOfBeauties(int[] nums) {
            int ans = 0;
            int n = nums.length;
            int[] left = new int[n];
            int[] right = new int[n];
            int max = nums[0], min = nums[n - 1];
            for (int i = 0; i < n; i++) {
                if(nums[i] > max) left[i] = 1;
                max = Math.max(max, nums[i]);
            }
            for (int i = n - 1; i >=0 ; i--) {
                if(nums[i] < min) right[i] = 1;
                min = Math.min(nums[i],min);
            }
            for (int i = 1; i < n - 1; i++) {
                if(left[i] == 1 && right[i] == 1) ans+=2;
                else if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) ans++;
            }
            return ans;
        }

    }
}
