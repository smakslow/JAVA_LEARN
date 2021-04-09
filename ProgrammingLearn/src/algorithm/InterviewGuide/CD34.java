package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

/* 3 5
        5 219 405 538 845 971
        2 148 558
        4 52 99 348 691*/
public class CD34 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int[] arr = parse(str, 2);
        int T = arr[0];
        int K = arr[1];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (T-- > 0) {
            str = reader.readLine().split(" ");
            arr = parse(str, str.length);
            for (int num : arr) {
                if (pq.size() < K) {
                    pq.offer(num);
                } else if (!pq.isEmpty() && num > pq.peek()) {
                    pq.poll();
                    pq.add(num);
                }
            }
        }
        reader.close();
        Integer[] res = new Integer[K];
        int i = 0;
        while (!pq.isEmpty()) {
            res[i++] = pq.poll();
        }
        Arrays.sort(res, (v1, v2) -> v2 - v1);
        for (Integer num : res) {
            System.out.print(num + " ");
        }
    }

    private static int[] parse(String[] str, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }
}
