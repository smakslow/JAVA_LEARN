package leetcode.weekly_contest._237;

import java.util.Arrays;

public class B {
    class Solution {
        public int maxIceCream(int[] costs, int coins) {
            Arrays.sort(costs);
            int ans = 0;
            for (int c : costs) {
                if(coins - c >= 0){
                    ans++;
                    coins -= c;
                }
            }
            return ans;
        }
    }
}
