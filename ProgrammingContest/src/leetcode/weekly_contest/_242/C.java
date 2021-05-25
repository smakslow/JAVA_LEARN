package leetcode.weekly_contest._242;

public class C {
    public boolean canReach(String s, int minJump, int maxJump) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] f = new int[n + 1];
        int[] d = new int[n + 1];
        f[1] = d[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (chars[i - 1] == '0' && i - minJump >= 1) {
                int left = Math.max(1, i - maxJump);
                int right = i - minJump;
                if (d[right] > d[left - 1]) f[i] = 1;
            }
            d[i] = d[i - 1] + f[i];
        }
        return f[n] == 1;
    }
}
