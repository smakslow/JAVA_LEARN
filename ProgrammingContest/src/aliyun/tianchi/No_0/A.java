package aliyun.tianchi.No_0;

/*给定两个正整数X和Y，以及正整数数组nums。
我们需要找到一个最大的index，使得在nums[0], nums[1], .... , nums[index]中，
出现X、Y的次数相等，且至少均出现一次，返回该index。
若不存在这样的index，则返回-1。*/
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
