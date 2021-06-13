package leetcode.weekly_contest._245;

import java.util.Arrays;

public class B {
    class Solution {
        public int maximumRemovals(String s, String p, int[] removable) {
            char[] a = s.toCharArray();
            char[] b = p.toCharArray();
            boolean[] removed = new boolean[a.length];

            int l = 0;
            int r = removable.length;
            while(l < r){
                int m = (l + r + 1) >> 1;
                Arrays.fill(removed, false);
                for(int j = 0; j < m; j++){
                    removed[removable[j]] = true;
                }
                if(isSubsequence(removed, a, b)){
                    l = m;
                }else{
                    r = m - 1;
                }
            }
            return l;
        }

        boolean isSubsequence(boolean[] removed, char[] a, char[] b){
            int j = 0;
            for(int i = 0; i < a.length && j < b.length; i++){
                if(removed[i]){
                    continue;
                }
                if(a[i] == b[j]){
                    j++;
                }
            }
            return j == b.length;
        }
    }


    public boolean isSubsequence(String s, String t) {
        // ÅÅ³ýÌØÊâÇé¿ö
        if (s.length() == 0) {
            return true;
        } else if (t.length() == 0) {
            return false;
        }

        int[][] alphabet = new int[t.length() + 1][26];
        for (int j = 0; j < 26; ++j) {
            alphabet[t.length()][j] = -1;
        }
        for (int i = t.length() - 1; i >= 0; --i) {
            for (int j = 0; j < 26; ++j) {
                if (t.charAt(i) == j + 'a') {
                    alphabet[i][j] = i;
                } else {
                    alphabet[i][j] = alphabet[i + 1][j];
                }
            }
        }
        int index = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (alphabet[index][s.charAt(i) - 'a'] == -1) {
                return false;
            }
            index = alphabet[index][s.charAt(i) - 'a'] + 1;
        }
        return true;
    }

}
