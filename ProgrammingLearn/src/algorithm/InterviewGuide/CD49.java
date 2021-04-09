package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD49 {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        str = reader.readLine().split(" ");
        reader.close();
        int[] arr = parseArr(str, n);
        Node head = createList(arr);//head为头节点
        head = deleteNode(head, k);
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    private static Node deleteNode(Node head, int k) {
        if (head == null || head.next == null || k <= 0) return head;
        Node fast = head.next;
        Node slow = head;
        //int count;
        for (int i = 0; i < k; i++) {
            fast = fast.next;

        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head.next;
    }

    private static int[] parseArr(String[] str, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    private static Node createList(int[] arr) {
        Node head = new Node(-1);
        Node cur = head;
        for (int value : arr) {
            cur.next = new Node(value);
            cur = cur.next;
        }
        return head;
    }
}
