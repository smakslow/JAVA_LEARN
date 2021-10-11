package leetcode.lcp;

import java.util.Arrays;
import java.util.Comparator;

public class LCP40 {
    class Solution {
        public int maxmiumScore(int[] cards, int cnt) {
            int n = cards.length;
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = cards[i];
            }
            Arrays.sort(arr, Comparator.reverseOrder());
            int sum = 0, lastodd = 0, lasteven = 0;
            for (int i = 0; i < cnt; i++) {
                sum += arr[i];
                if ((arr[i] & 1) == 0) lasteven = arr[i];
                else lastodd = arr[i];
            }
            if ((sum & 1) == 0) return sum;
            int a = 0, b = 0;
            for (int i = cnt; i < n; i++) {
                if (lasteven != 0 && a == 0 && (arr[i] & 1) != 0)
                    a = sum - lasteven + arr[i];
                if (lastodd != 0 && b == 0 && (arr[i] & 1) == 0)
                    b = sum - lastodd + arr[i];
            }
            return Math.max(a, b);
        }
    }

}
