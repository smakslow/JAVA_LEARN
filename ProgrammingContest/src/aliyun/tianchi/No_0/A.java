package aliyun.tianchi.No_0;

/*��������������X��Y���Լ�����������nums��
������Ҫ�ҵ�һ������index��ʹ����nums[0], nums[1], .... , nums[index]�У�
����X��Y�Ĵ�����ȣ������پ�����һ�Σ����ظ�index��
��������������index���򷵻�-1��*/
public class A {
    public int LongestPrefix(int X, int Y, int[] nums) {
        // write your code here
        int n = nums.length;
        int countX = 0, countY = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == X) {
                countX++;
            }
            if (nums[i] == Y) {
                countY++;
            }
            if (countX != 0 && countX == countY) {
                index = i;
            }
        }
        return index;
    }
}
