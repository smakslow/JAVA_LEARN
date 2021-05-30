package leetcode.weekly_contest._243;

import java.util.PriorityQueue;

public class C {
    class Solution {
        class Server implements Comparable<Server> {
            int index;
            int weight;
            int time;

            public Server(int index, int weight, int time) {
                this.index = index;
                this.weight = weight;
                this.time = time;
            }

            public int compareTo(Server o) {
                if (this.time == o.time) {
                    if (this.weight == o.weight) {
                        return this.index - o.index;
                    }
                    return this.weight - o.weight;
                }
                return this.time - o.time;
            }
        }

        public int[] assignTasks(int[] servers, int[] tasks) {
            int n = servers.length;
            PriorityQueue<Server> running = new PriorityQueue<>();
            PriorityQueue<Server> free = new PriorityQueue<>((o1, o2) -> {
                if (o1.weight == o2.weight) {
                    return o1.index - o2.index;
                }
                return o1.weight - o2.weight;
            });
            for (int i = 0; i < n; i++) {
                free.offer(new Server(i, servers[i], 0));
            }
            int m = tasks.length;
            int[] res = new int[m];
            for (int i = 0; i < m; i++) {
                while (!running.isEmpty() && running.peek().time <= i) {
                    free.offer(running.poll());
                }
                if (!free.isEmpty()) {
                    Server server = free.poll();
                    server.time = i + tasks[i];
                    res[i] = server.index;
                    running.offer(server);
                } else {
                    Server server = running.poll();
                    res[i] = server.index;
                    server.time += tasks[i];
                    running.offer(server);
                }
            }
            return res;
        }
    }
}
