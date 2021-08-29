package algorithm.niuke;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(); // 员工
        int n = in.nextInt(); //月饼  m个数  += n
        int ans = 0, t = n - m;
        dfs(0, m, t, ans);
        System.out.println(ans);
    }

    private static void dfs(int step, int m, int t, int ans) {
        if (step < m && t == 0) {
            ans++;
            return;
        }
        dfs(step + 1, m, t - 1, ans);
        dfs(step + 1, m, t - 2, ans);
        
    }
}
