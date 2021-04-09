package Codeforces;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class _1470A {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int incrementAndGet = atomicInteger.incrementAndGet();
        System.out.println(incrementAndGet);
        Scanner in = new Scanner(System.in);
        System.out.println(Solution.totalNQueens(in.nextInt()));
    }

    static class Solution {
        private static int size;
        private static int count;

        private static void solve(int row, int ld, int rd) {
            if (row == size) {
                count++;
                return;
            }
            int pos = size & (~(row | ld | rd));
            while (pos != 0) {
                int p = pos & (-pos);
                pos -= p;
                pos &= pos - 1;
                solve(row | p, (ld | p) << 1, (rd | p) >> 1);
            }
        }

        public static int totalNQueens(int n) {
            count = 0;
            size = (1 << n) - 1;
            solve(0, 0, 0);
            return count;
        }
    }
}
