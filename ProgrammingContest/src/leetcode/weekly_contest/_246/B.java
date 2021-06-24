package leetcode.weekly_contest._246;

public class B {
    class Solution {
        int get(String time) {
            String[] str = time.split(":");
            return Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
        }

        public int numberOfRounds(String startTime, String finishTime) {
            int a = get(startTime), b = get(finishTime);
            if (a > b) b += 24 * 60;
            a = (a + 14) / 15;
            b /= 15;
            return b - a;
        }
    }
}
