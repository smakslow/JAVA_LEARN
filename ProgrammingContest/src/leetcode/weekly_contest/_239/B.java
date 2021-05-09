package leetcode.weekly_contest._239;

public class B {
    class Solution {
        public boolean splitString(String s) {
            char[] chars = s.toCharArray();
            int n = chars.length;
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (chars[i] != '0') {
                    index = i;
                    break;
                }
            }
            int pre = 0;
            for (int i = index; i < n; ) {
                pre = chars[i] - '0';
                for (int j = i + 1, car = 1,next = 0; j < n; j++) {
                    next = next * car + chars[j] - '0';
                    car *= 10;
                    if(next - pre != 1){
                        break;
                    }
                }
            }
            return true;
        }
    }
}
