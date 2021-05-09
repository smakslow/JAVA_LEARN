package aliyun.tianchi.No_67;

import java.util.ArrayList;
import java.util.List;

public class A {
    public class Solution {
        /**
         * @param score: When the j-th driver gets the i-th order, we can get score[i][j] points.
         * @return: return an array that means the array[i]-th driver gets the i-th order.
         */
        int MAX = Integer.MIN_VALUE;

        public int[] orderAllocation(int[][] score) {
            // write your code here
            int n = score[0].length;
            boolean[] used = new boolean[n];
            List<Integer> res = new ArrayList<>();
            backTrack(score, used, res, 0, 0, new ArrayList<>());
            int[] arr = new int[n];
            for (int i = 0, j = 0; i < n && j < res.size(); i++, j += 2) {
                arr[i] = res.get(j + 1) + 1;
            }
            return arr;
        }


        public void backTrack(int[][] arr, boolean[] visit, List<Integer> list, int N, int sum, List<Integer> t) {
            if (N == visit.length) {
                //计算和  与 列表中的相比较  列表保存最大的
                if (MAX < sum) {
                    list.clear();
                    list.addAll(t);
                    MAX = sum;
                }
                return;
            }

            for (int i = 0; i < visit.length; i++) {
                if (!visit[i]) {

                    t.add(N);
                    t.add(i);
                    visit[i] = true;
                    backTrack(arr, visit, list, N + 1, sum + arr[N][i], t);
                    t.remove(t.size() - 1);
                    t.remove(t.size() - 1);

                }
                visit[i] = false;
            }
        }
    }
}

