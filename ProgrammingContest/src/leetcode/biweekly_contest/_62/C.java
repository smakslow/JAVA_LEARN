package leetcode.biweekly_contest._62;

public class C {
    class Solution {
        public int maxConsecutiveAnswers(String answerKey, int k) {
            char[] chars = answerKey.toCharArray();
            int n = chars.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (chars[i] == 'T') arr[i] = 1;
                else arr[i] = 0;
            }
            int a = longestOnes(arr, k);
            for (int i = 0; i < n; i++) {
                if (chars[i] == 'F') arr[i] = 1;
                else arr[i] = 0;
            }
            int b = longestOnes(arr, k);
            return Math.max(a, b);
        }

        public int longestOnes(int[] nums, int k) {
            int n = nums.length;
            int left = 0, lsum = 0, rsum = 0;
            int ans = 0;
            for (int right = 0; right < n; ++right) {
                rsum += 1 - nums[right];
                while (lsum < rsum - k) {
                    lsum += 1 - nums[left];
                    ++left;
                }
                ans = Math.max(ans, right - left + 1);
            }
            return ans;
        }
    }

    public int characterReplacement(String s, int k) {
        int[] num = new int[26];
        int n = s.length();
        int maxn = 0;
        //left:��߽磬���ڻ���ʱ��ȥͷ�����߼��㳤��
        //right:�ұ߽磬���ڼ��ϻ���β�ͻ��߼��㳤��
        int left = 0, right = 0;
        while (right < n) {
            int indexR = s.charAt(right) - 'A';
            num[indexR]++;
            //�󴰿���������ĳ��ĸ��������
            //����ĳ��ĸ������ĳ�����е������������ڳ���ֻ��������߲��䣨ע�����leftָ��ֻ�ƶ���0-1�Σ�
            //�����������壺����������������Ҳ���������ά�ֳ��Ȳ��䷵�ؽ������Ӱ��
            maxn = Math.max(maxn, num[indexR]);

            //����len=right-left+1,���¼��len
            //len-��ĸ����������>�滻��Ŀ => len>��ĸ����������+�滻��Ŀ
            //����һ�£��滻��Ŀ�ǲ����=k,��ĸ�����������ǿ��ܱ仯�ģ���ˣ�ֻ����ĸ�������������ӵ������len�����õ����ֵ
            //�ֲ���������������£�left��rightһ���ƶ�,len�����
            if (right - left + 1 - maxn > k) {
                //����Ҫ���ģ���ΪleftԽ���õ㣬������ֵ��Ӱ��
                num[s.charAt(left) - 'A']--;
                left++;
            }
            //���������ʱ����ʵright�����һ��
            right++;
        }
        //��Ϊright����һ�������Ϊ(right-1)-left+1==right-left
        return right - left;
    }


}
