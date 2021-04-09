package algorithm.niuke;

import java.util.*;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null || lists.size() == 0) return null;
        Queue<Integer> pq = new PriorityQueue<>();
        for (ListNode node : lists) {
            while (node != null) {
                pq.offer(node.val);
                node = node.next;
            }
        }
        ListNode cur =new ListNode(-1);
        ListNode pre = cur;
        while(!pq.isEmpty()){
            cur.next = new ListNode(pq.poll());
            cur = cur.next;
        }
        return  pre.next;
    }
}
