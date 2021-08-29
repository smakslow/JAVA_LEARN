package algorithm.niuke.niuke_recruit._2021Ã⁄—∂“Ù¿÷;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (!set.add(x)) {
                pq.add(x);
            } else {
                pq.remove(x);
            }
        }
        if (pq.isEmpty()) System.out.println("-1");
        else System.out.println(pq.poll());
    }
}
