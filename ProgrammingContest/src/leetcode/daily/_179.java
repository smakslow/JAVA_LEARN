package leetcode.daily;

import java.util.Arrays;

public class _179 {
    class Solution {
        public String largestNumber(int[] nums) {
            String[] str = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                str[i] = String.valueOf(nums[i]);
            }
            Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
            StringBuilder sb = new StringBuilder();
            for (String s : str) {
                sb.append(s);
            }
            String ans = sb.toString();
            for (int i = 0; i < ans.length(); ) {
                if (ans.charAt(i) == '0') {
                    if (i != ans.length() - 1) {
                        i++;
                    } else {
                        ans = ans.substring(i);
                        break;
                    }
                } else break;
            }
            return ans;
        }
    }
}
