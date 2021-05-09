package leetcode.biweekly_contest._49;

public class B {
    class Solution {
        public boolean areSentencesSimilar(String sentence1, String sentence2) {
            if (sentence1.equals(sentence2)) return true;
            String[] shorter = sentence1.split(" ");
            String[] longer = sentence2.split(" ");
            int min = shorter.length;
            int max = longer.length;
            if (max == min) return false;
            if (max < min) return areSentencesSimilar(sentence2, sentence1);
            int left = 0;
            for (int k = 0; k <max && left < min; k++) {
                if(shorter[left].equals(longer[k])) left++;
                else break;
            }
            int right = min - 1;
            for (int k = max - 1; k >= 0 && right>= 0 ; k--) {
                if(shorter[right].equals(longer[k])) right--;
                else break;
            }
            return left > right;
        }
    }
}
