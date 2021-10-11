package leetcode.weekly_contest._257;

import java.util.*;

public class D {

    class Solution {
        class DSU {
            int[] parent;

            public DSU(int N) {
                parent = new int[N];
                for (int i = 0; i < N; ++i)
                    parent[i] = i;
            }

            public int find(int x) {
                if (parent[x] != x) parent[x] = find(parent[x]);
                return parent[x];
            }

            public void union(int x, int y) {
                parent[find(x)] = find(y);
            }
        }

        public boolean gcdSort(int[] nums) {
            int N = nums.length;
            // factored[i] = a list of unique prime factors of LCP39[i]
            ArrayList<Integer>[] factored = new ArrayList[N];
            for (int i = 0; i < N; ++i) {
                factored[i] = new ArrayList<>();
                int d = 2, x = nums[i];
                while (d * d <= x) {
                    if (x % d == 0) {
                        while (x % d == 0)
                            x /= d;
                        factored[i].add(d);
                    }

                    d++;
                }

                if (x > 1 || factored[i].isEmpty())
                    factored[i].add(x);
            }

            Set<Integer> primes = new HashSet<>();
            for (List<Integer> facs : factored)
                primes.addAll(facs);

            int[] primesL = new int[primes.size()];
            int t = 0;
            for (int x : primes)
                primesL[t++] = x;

            Map<Integer, Integer> primeToIndex = new HashMap<>();
            for (int i = 0; i < primesL.length; ++i)
                primeToIndex.put(primesL[i], i);

            DSU dsu = new DSU(primesL.length);
            for (List<Integer> facs : factored)
                for (int x : facs)
                    dsu.union(primeToIndex.get(facs.get(0)), primeToIndex.get(x));

            int[] count = new int[primesL.length];
            for (List<Integer> facs : factored)
                count[dsu.find(primeToIndex.get(facs.get(0)))]++;

            int ans = 0;
            for (int x : count)
                if (x > ans)
                    ans = x;
            return true;
        }
    }
}

