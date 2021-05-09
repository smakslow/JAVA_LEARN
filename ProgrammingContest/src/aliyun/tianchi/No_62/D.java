package aliyun.tianchi.No_62;

import java.util.*;

public class D {
    class Task {
        int val;
        int date;

        public Task(int val, int date) {
            this.val = val;
            this.date = date;
        }
    }

    public int algorithmLearning(int[] val, int[] date) {
        int n = val.length;
        Task[] tasks = new Task[n];
        for (int i = 0; i < n; i++) tasks[i] = (new Task(val[i], date[i]));
        Arrays.sort(tasks, Comparator.comparingInt(o -> o.date));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (tasks[i].date > pq.size()) {
                res += tasks[i].val;
                pq.add(tasks[i].val);
            } else {
                res += tasks[i].val;
                pq.add(tasks[i].val);
                res -= pq.poll();
            }
        }
        return res;
    }
}
