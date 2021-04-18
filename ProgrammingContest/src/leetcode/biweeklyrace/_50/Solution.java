package leetcode.biweeklyrace._50;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    // ��ȷ����λ����ȷ����λ���е�̰���㷨����˼�������ܱ�֤�������������
    // һλ����һλȥȷ�������λ�Ĵ�С
    // �������ʣ�a ^ b = c ���� a ^ c = b���� b ^ c = a

    public int findMaximumXOR(int n) {
        int res = 0;
        int mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask = mask | (1 << i);

            Set<Integer> set = new HashSet<>();
            for (int j = 1; j < n; j++) {
                set.add(j & mask);
            }

            int temp = res | (1 << i);
            for (Integer prefix : set) {
                if (set.contains(prefix ^ temp)) {
                    res = temp;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};

    }
}
