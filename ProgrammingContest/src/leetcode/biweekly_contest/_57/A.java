package leetcode.biweekly_contest._57;

import java.util.Arrays;

public class A {
    class Solution {
        public boolean areOccurrencesEqual(String s) {
            int[] cnt = new int[26];
            for (char c : s.toCharArray()) {
                cnt[c - 'a']++;
            }
            Arrays.sort(cnt);
            for (int i = 1; i < 26; i++) {
                if(cnt[i] != cnt[i - 1] && cnt[i - 1] != 0) return false;
            }
            return true;
        }
    }
}
