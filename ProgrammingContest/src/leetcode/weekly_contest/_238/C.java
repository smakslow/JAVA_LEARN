package leetcode.weekly_contest._238;

import java.util.HashSet;
import java.util.PriorityQueue;

public class C {
    public static int longestBeautifulSubstring(String word) {
        char[] chars = word.toCharArray();
        int n = chars.length;
        PriorityQueue<Character> pq = new PriorityQueue<>((o1, o2) -> Character.compare(o2, o1));
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i < n; ) {
            if (!pq.isEmpty()) {//堆不为空
                if (chars[i] >= pq.peek()) {//比前面的大
                    pq.offer(chars[i]);
                    set.add(chars[i]);
                    i++;
                } else {
                    if (set.size() == 5) {
                        res = Math.max(res, pq.size());
                    }
                    while (!pq.isEmpty()) {
                        System.out.print(pq.poll() + " ");
                    }
                    set.clear();
                    System.out.println();
                }
            } else {//如果为空,找到‘a'
                while (i < n && chars[i] != 'a') i++;
                if (i >= n) break;
                pq.offer(chars[i]);
                set.add(chars[i]);
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String a = "e";
        longestBeautifulSubstring(a);
    }
}
