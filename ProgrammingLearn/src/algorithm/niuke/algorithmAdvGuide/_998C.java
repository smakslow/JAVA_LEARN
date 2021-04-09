package algorithm.niuke.algorithmAdvGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _998C{
    static int[] order = new int[20];
    static boolean[] chosen = new boolean[20];
    static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
    static  java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        calc(1,n);
        out.flush();
        out.close();
    }
    private static void calc(int k,int n){
        if(k == n + 1){
            for(int i = 1;i <= n;i++){
                out.print(order[i] + " ");
            }
            out.println();
            return;
        }
        for(int i = 1;i <= n;++i){
            if(chosen[i]) continue;
            order[k] = i;
            chosen[i] = true;
            calc(k + 1,n);
            chosen[i] = false;
            order[k] = 0;
        }
    }
}
