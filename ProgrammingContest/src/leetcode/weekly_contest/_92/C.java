package leetcode.weekly_contest._92;

public class C {
    class Solution {
        public int primePalindrome(int n) {
            int ans;
            for (int i = n; ; i++) {
                if (par(String.valueOf(i)) && judge(i)) {
                    ans = i;
                    break;
                }
            }
            return ans;
        }

        private boolean par(String s) {
            int i = 0;
            int j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) return false;
                i++;
                j--;
            }
            return true;
        }

        private boolean judge(int n) {
            int q = (int) Math.sqrt(n + 1);
            for (int i = 2; i <= q; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }

    public boolean validWordSquare(String[] words) {
        // Write your code here
        int n = words.length;
        for (int i = 0; i < n; i++) {
            String word = words[i];
            int m = word.length();
            if (n != m) return false;
            for (int j = 0; j < n; j++) {
                if (word.charAt(j) != words[j].charAt(i)) return false;
            }
        }
        return true;
    }

    public int arrangeCoins(int n) {
        // Write your code here
        int start = 1;
        int ans = 0;
        while (n >= start) {
            n -= start;
            ans++;
            start++;
        }
        return ans;
    }
}
