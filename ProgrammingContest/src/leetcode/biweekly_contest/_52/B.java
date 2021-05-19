package leetcode.biweekly_contest._52;

public class B {
    class Solution {
        public int[] memLeak(int memory1, int memory2) {
            int[] ans = new int[3];
            int s = 1;
            while (memory1 >= s || memory2 >= s) {
                if (memory1 >= memory2)
                    memory1 -= s;
                else
                    memory2 -= s;
                s++;
            }
            ans[0] = s;
            ans[1] = memory1;
            ans[2] = memory2;
            return ans;
        }
    }
}
