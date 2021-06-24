package leetcode.weekly_contest._246;

public class A {
    class Solution {
        public String largestOddNumber(String num) {
            String answer = "";
            for (int i = num.length() - 1; i >= 0 ; i--) {
                if(((num.charAt(i) - '0') & 1) == 1){
                    answer = num.substring(0,i + 1);
                    break;
                }
            }
            return answer;
        }
    }
}
