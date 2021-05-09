package leetcode.weekly_contest._235;

import java.util.Arrays;
import java.util.TreeSet;

public class C {
    class Solution {
        public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
            //����һ��nums1
            int[] n = new int[nums1.length];
            for (int i = 0; i < n.length; i++) {
                n[i] = nums1[i];
            }
            //��n������ʹ�ö��ֵ�ǰ��
            Arrays.sort(n);

            //��max����Max(abs(ai-ci)-abs(ai-bi))(i=0,1,2,����n-1)
            int max = 0;

            //��max
            for (int i = 0; i < nums1.length; i++) {
                //fun�������ŵ�abs(a-b)
                max = Math.max(max, Math.abs(nums1[i] - nums2[i]) - fun(n, nums2[i]));
            }
            //�����ͷ����
            long ans = 0;
            for (int i = 0; i < nums1.length; i++) {
                ans += Math.abs(nums1[i] - nums2[i]);
            }
            //��ȥmax�ͺ���
            ans -= max;
            ans = ans % 1000000007;

            return (int) ans;
        }

        int fun(int[] n, int a) {
            int l = 0, r = n.length - 1, mid;
            int la = n[l], ra = n[r];
            while (l <= r) {
                mid = (r + l) >> 1;
                if (n[mid] == a) {
                    return 0;
                } else if (n[mid] < a) {
                    l = mid + 1;
                    la = n[mid];
                } else {
                    r = mid - 1;
                    ra = n[mid];
                }
            }

            return Math.min(Math.abs(a - la), Math.abs(a - ra));
        }
    }


    class Solution1 {
        public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
            TreeSet<Integer> set = new TreeSet<>();
            int inf = (int) 1e9;
            set.add(-inf);
            set.add(inf);
            for (int x : nums1) {
                set.add(x);
            }
            long sum = 0;
            int shrink = 0;
            for (int i = 0; i < nums1.length; i++) {
                int x = nums1[i];
                int y = nums2[i];
                int cost = Math.abs(x - y);
                int beta = Math.max(cost - (y - set.floor(y)), cost - (set.ceiling(y) - y));
                shrink = Math.max(shrink, beta);
                sum += cost;
            }
            sum -= shrink;
            int mod = (int) 1e9 + 7;
            return (int) (sum % mod);
        }
    }

}
