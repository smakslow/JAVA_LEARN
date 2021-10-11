package leetcode.lcp;

import java.util.Arrays;

public class LCP34 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int maxValue(TreeNode root, int k) {
            return Arrays.stream(dynamic(root, k)).max().getAsInt();
        }

        private int[] dynamic(TreeNode root, int k) {
            int[] dp = new int[k + 1];
            //1.初始化：空节点为底，自底向上
            if (root == null) return dp;
            //2.获取左、右子树染色状态的dp表
            //- 左子树
            int[] l = dynamic(root.left, k);
            //- 右子树
            int[] r = dynamic(root.right, k);
            //3.更新处理root 染色/不染色 的情况下的dp表
            //- 不染root
            int ml = Arrays.stream(l).max().getAsInt(), mr = Arrays.stream(r).max().getAsInt();
            dp[0] = ml + mr;
            //- 染root
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < i; j++) {
                    //- 还需要染色 i - 1 个点，左子树 j 个，右子树 i-1-j 个
                    dp[i] = Math.max(dp[i], root.val + l[j] + r[i - 1 - j]);
                }
            }
            //4.更新完毕，返回后继续向上动态规划
            return dp;
        }
    }
}
