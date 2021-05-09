package leetcode.daily;

import java.util.*;

public class _690 {
    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    class Solution {
        public int getImportance(List<Employee> employees, int id) {
            Map<Integer, Employee> map = new HashMap<>();
            for (Employee employee : employees) {
                map.put(employee.id, employee);
            }
            int total = 0;
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(id);
            while (!queue.isEmpty()) {
                int curId = queue.poll();
                Employee employee = map.get(curId);
                total += employee.importance;
                List<Integer> subordinates = employee.subordinates;
                for (int subId : subordinates) {
                    queue.offer(subId);
                }
            }
            return total;
        }
    }
}
