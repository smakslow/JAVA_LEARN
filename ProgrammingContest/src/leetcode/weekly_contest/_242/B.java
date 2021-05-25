package leetcode.weekly_contest._242;

public class B {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        if (hour < n - 1) return -1;
        int i = 0, j = 1000000000;
        while (i < j) {
            int mid = (i + j) >> 1;
            if (judge(dist, mid, hour)) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }

    private boolean judge(int[] dist, int speed, double hour) {
        double ans = 0;
        for (int i = 0; i < dist.length - 1; i++) {
            ans += (int) Math.ceil(dist[i] * 1.0 / speed);
        }
        ans += dist[dist.length - 1]*1.0 / speed;
        return ans <= hour;
    }
}
