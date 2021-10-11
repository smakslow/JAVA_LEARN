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
            //1.��ʼ�����սڵ�Ϊ�ף��Ե�����
            if (root == null) return dp;
            //2.��ȡ��������Ⱦɫ״̬��dp��
            //- ������
            int[] l = dynamic(root.left, k);
            //- ������
            int[] r = dynamic(root.right, k);
            //3.���´���root Ⱦɫ/��Ⱦɫ ������µ�dp��
            //- ��Ⱦroot
            int ml = Arrays.stream(l).max().getAsInt(), mr = Arrays.stream(r).max().getAsInt();
            dp[0] = ml + mr;
            //- Ⱦroot
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < i; j++) {
                    //- ����ҪȾɫ i - 1 ���㣬������ j ���������� i-1-j ��
                    dp[i] = Math.max(dp[i], root.val + l[j] + r[i - 1 - j]);
                }
            }
            //4.������ϣ����غ�������϶�̬�滮
            return dp;
        }
    }
}
