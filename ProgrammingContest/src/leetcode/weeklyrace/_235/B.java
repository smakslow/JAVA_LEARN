package leetcode.weeklyrace._235;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class B {
    class Solution {
        class log {
            int id;
            int time;

            public log(int id, int time) {
                this.id = id;
                this.time = time;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                log log = (log) o;
                return id == log.id &&
                        time == log.time;
            }

            @Override
            public int hashCode() {
                return Objects.hash(id, time);
            }
        }

        public int[] findingUsersActiveMinutes(int[][] logs, int k) {
            int[] res = new int[k];
            HashSet<log> set = new HashSet<>();
            for (int[] arr : logs) {
                set.add(new log(arr[0], arr[1]));
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (log log : set) {
                map.put(log.id, map.getOrDefault(log.id, 0) + 1);
            }
            for (Integer value : map.values()) {
                res[value - 1]++;
            }
            return res;
        }
    }
}
