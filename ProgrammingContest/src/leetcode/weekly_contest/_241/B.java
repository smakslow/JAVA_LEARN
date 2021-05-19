package leetcode.weekly_contest._241;

public class B {
    class Solution {
        public int minSwaps(String s) {
            char[] ch = s.toCharArray();
            int a = 0;
            int b = 0;
            for (char c : ch) {
                if (c == '0') a++;
                else b++;
            }
            if (Math.abs(a - b) > 1) return -1;
            int ans = 0;
            for (int i = 1; i < ch.length; i++) {
                if (ch[i] != ch[i - 1]) continue;
                int j = i + 1;
                char temp = ch[i];
                while (j < ch.length && ch[j] == temp) j++;
                int k = j;
                while(k < ch.length && ch[k] != ch[j]) k++;
                swap(ch, i, k);
                ans++;
            }
            return ans;
        }

        private void swap(char[] ch, int i, int j) {
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
        }
    }
}
