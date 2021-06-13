package leetcode.weekly_contest._245;

import java.util.Arrays;

public class D {
   static class Solution {
        int[][][] max;
        int[][][] min;

        int max(int a, int b, int c){
            if(a < c){
                return max(c, b, a);
            }
            if(max[a][b][c] == -1){
                max[a][b][c] = 0;
                if(a == c){
                    return max[a][b][c] = 1;
                }
                int n = a + b + c + 2;
                int nextRound = (n + 1) / 2;
                if(a >= b + c + 1){
                    for(int i = 0; i <= c; i++){
                        for(int j = 0; j <= b; j++){
                            int k = nextRound - i - j - 2;
                            max[a][b][c] = Math.max(max[a][b][c], max(k, j, i) + 1);
                        }
                    }
                }else{
                    for(int i = 0; i <= c; i++){
                        for(int j = 0; j <= a - c - 1; j++){
                            int k = nextRound - c - j - 2;
                            max[a][b][c] = Math.max(max[a][b][c], max(c - i + j, k, i) + 1);
                        }
                    }
                }
            }
            return max[a][b][c];
        }

        int min(int a, int b, int c){
            if(a < c){
                return min(c, b, a);
            }
            if(min[a][b][c] == -1){
                min[a][b][c] = (int)1e9;
                if(a == c){
                    return min[a][b][c] = 1;
                }
                int n = a + b + c + 2;
                int nextRound = (n + 1) / 2;
                if(a >= b + c + 1){
                    for(int i = 0; i <= c; i++){
                        for(int j = 0; j <= b; j++){
                            int k = nextRound - i - j - 2;
                            min[a][b][c] = Math.min(min[a][b][c], min(k, j, i) + 1);
                        }
                    }
                }else{
                    for(int i = 0; i <= c; i++){
                        for(int j = 0; j <= a - c - 1; j++){
                            int k = nextRound - c - j - 2;
                            min[a][b][c] = Math.min(min[a][b][c], min(c - i + j, k, i) + 1);
                        }
                    }
                }
            }
            return min[a][b][c];
        }

        public int[] earliestAndLatest(int n, int firstPlayer, int secondPlayer) {
            max = new int[n + 1][n + 1][n + 1];
            min = new int[n + 1][n + 1][n + 1];
            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= n; j++){
                    for(int k = 0; k <= n; k++){
                        max[i][j][k] = min[i][j][k] = -1;
                    }
                }
            }

            int a = max(firstPlayer - 1, secondPlayer - firstPlayer - 1, n - secondPlayer);
            int b = min(firstPlayer - 1, secondPlayer - firstPlayer - 1, n - secondPlayer);
            System.out.println(Arrays.deepToString(max));
            System.out.println(Arrays.deepToString(min));
            return new int[]{b, a};
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] latest = solution.earliestAndLatest(11, 2, 4);
        System.out.println(Arrays.toString(latest));
    }
}
