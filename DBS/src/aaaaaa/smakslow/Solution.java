package aaaaaa.smakslow;

import java.util.PriorityQueue;


class Solution {


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        public int[] getLeastNumbers(int[] arr, int k) {
            int len = arr.length;
            // ʹ��һ������ k ��Ԫ�ص���С��
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
            for (int i = 0; i < k; i++) {
                minHeap.add(arr[i]);
            }
            for (int i = k; i < len; i++) {
                // ��һ�ۣ����ó�����Ϊ�п���û�б�Ҫ�滻
                Integer topEle = minHeap.peek();
                // ֻҪ��ǰ������Ԫ�رȶѶ�Ԫ�ش󣬶Ѷ�������������Ԫ�ؽ�ȥ
                if (arr[i] > topEle) {
                    minHeap.poll();
                    minHeap.add(arr[i]);
                }
            }
            int[] res = new int[k];
            for (int i = 0; i < k; i++) {
                res[i] = minHeap.poll();
            }
            return res;

        }

}
