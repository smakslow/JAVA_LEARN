package leetcode.daily;

public class _42 {

    public int trap(int[] height) {
        int ans = 0;
        int n = height.length;
        if (n < 3) return ans;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0];
        right[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            ans += Math.min(left[i], right[i]) - left[i];
        }
        return ans;
    }
}
