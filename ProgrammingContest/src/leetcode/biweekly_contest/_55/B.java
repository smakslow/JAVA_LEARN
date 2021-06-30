package leetcode.biweekly_contest._55;

public class B {
    class Solution {
        public String removeOccurrences(String s, String part) {
            if(s.contains(part)){
                return removeOccurrences(s.replaceAll(part,"" ),part);
            }
            return s;
        }
    }
}
