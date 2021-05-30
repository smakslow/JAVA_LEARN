package 挑战程序设计竞赛;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CPC52 {
    static int n, W;
    static int[] w = {2, 1, 3, 2};
    static int[] v = {3, 2, 4, 2};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = 4;
        W = 5;
        System.out.println(rec(0,W,0));
    }

    private static int rec(int i, int j,int res) {
        if (i == n) {
            res = 0;
        } else if (j < w[i]) {
            res = rec(i + 1, j,res);
        } else {
            res = Math.max(rec(i + 1, j,res), rec(i + 1, j - w[i],res)) + v[i];
        }
        return res;
    }
}
