package leetcode.weekly_contest._233;

import java.util.Comparator;
import java.util.PriorityQueue;

public class B {
    class Solution {
        public int getNumberOfBacklogOrders(int[][] orders) {
            PriorityQueue<int[]> sell = new PriorityQueue<>(Comparator.comparingInt(v -> v[0]));//销售[0] price,[1]件数
            PriorityQueue<int[]> buy = new PriorityQueue<>((v1, v2) -> v2[0] - v1[0]);//采购
            for(int[] o : orders){
                if(o[2] == 0){//buy
                     sell.add(new int[]{o[0],o[1]});
                }else{
                    buy.add(new int[]{o[0],o[1]});
                }
            }
            while(!sell.isEmpty() && ! buy.isEmpty() && buy.peek()[0] >= sell.peek()[0]){
                int[] b = buy.poll();
                int[] s = sell.poll();
                int min = Math.min(b[1],s[1]);
                b[1] -= min;
                s[1]  -= min;
                if(b[1] > 0){
                    buy.offer(new int[]{b[0],b[1]});
                }
                if(s[1] > 0){
                    sell.offer(new int[]{s[0],s[1]});
                }
            }
            long res = 0;
            for(int[] t : buy){
                res += t[1];
            }
            for(int[] t : sell){
                res += t[1];
            }
            return (int) (res % 1000000007);
        }
    }
}
