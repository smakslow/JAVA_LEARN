package leetcode.weekly_contest._256;

public class C {
    class Solution {
        int n, ans, w;
        int[] sum = new int[20];

        void dfs(int[] tasks, int now, int cnt) {
            if (cnt >= ans) return;
            if (now == n) {
                ans = Math.min(ans, cnt);
                return;
            }
            for (int i = 1; i < cnt; i++) {
                if (sum[i] + tasks[now] <= w) {
                    sum[i] += tasks[now];//更新
                    dfs(tasks, now + 1, cnt);
                    sum[i] -= tasks[now];//还原现场
                }
            }
            sum[cnt + 1] = tasks[now];
            dfs(tasks, now + 1, cnt + 1);
            sum[cnt + 1] = 0;//还原现场
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
