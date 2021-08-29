package leetcode.weekly_contest._256;

public class C {
    class Solution {
        int n, ans, w;
        int[] cab = new int[20];

        void dfs(int[] tasks, int now, int cnt) {
            if (cnt >= ans) return;
            if (now == n) {
                ans = Math.min(ans, cnt);
                return;
            }
            for (int i = 1; i < cnt; i++) {
                if (cab[i] + tasks[now] <= w) {
                    cab[i] += tasks[now];//����
                    dfs(tasks, now + 1, cnt);
                    cab[i] -= tasks[now];//��ԭ�ֳ�
                }
            }
            cab[cnt + 1] = tasks[now];
            dfs(tasks, now + 1, cnt + 1);
            cab[cnt + 1] = 0;//��ԭ�ֳ�
        }

        public int minSessions(int[] tasks, int sessionTime) {
            n = tasks.length;
            w = sessionTime;
            ans = n;
            dfs(tasks, 0, 0);
            return ans;
        }
    }
}
