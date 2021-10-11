package leetcode.weekly_contest._258;

public class A {
    class Solution {
        public String reversePrefix(String word, char ch) {
            StringBuilder sb = new StringBuilder();
            char[] chars = word.toCharArray();
            int idx = 0;
            for (int i = 0; i < word.length(); i++) {
                if(chars[i] == ch){
                    idx = i;
                    break;
                }
            }
            for (int i = idx; i >=0 ; i--) {
                sb.append(chars[i]);
            }
            return sb.toString() + word.substring(idx + 1);
        }
    }
}
