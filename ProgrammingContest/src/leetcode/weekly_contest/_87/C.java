package leetcode.weekly_contest._87;

import java.util.TreeMap;

public class C {
    class Solution {
        public boolean isNStraightHand(int[] hand, int w) {
            int n = hand.length;
            if (n % w != 0) return false;
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for (int h : hand) {
                treeMap.put(h, treeMap.getOrDefault(h, 0) + 1);
            }
            while (treeMap.size() > 0) {
                int first = treeMap.firstKey();
                for (int card = first; card < first + w; ++card) {
                    if (!treeMap.containsKey(card)) return false;
                    int c = treeMap.get(card);
                    if (c == 1) treeMap.remove(card);
                    else treeMap.replace(card, c - 1);
                }
            }
            return true;
        }
    }
}
