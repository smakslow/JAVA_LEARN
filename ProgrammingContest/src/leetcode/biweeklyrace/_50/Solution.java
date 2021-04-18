package leetcode.biweeklyrace._50;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    // 先确定高位，再确定低位（有点贪心算法的意思），才能保证这道题的最大性质
    // 一位接着一位去确定这个数位的大小
    // 利用性质：a ^ b = c ，则 a ^ c = b，且 b ^ c = a

    public int findMaximumXOR(int n) {
        int res = 0;
        int mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask = mask | (1 << i);

            Set<Integer> set = new HashSet<>();
            for (int j = 1; j < n; j++) {
                set.add(j & mask);
            }

            int temp = res | (1 << i);
            for (Integer prefix : set) {
                if (set.contains(prefix ^ temp)) {
                    res = temp;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};

    }
}
