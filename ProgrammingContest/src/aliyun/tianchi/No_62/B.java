package aliyun.tianchi.No_62;

public class B {
    public int addDigits(int num) {
        // write your code here
        while (num >= 10) {
            int res = 0;
            while (num != 0) {
                res += num % 10;
                num /= 10;
            }
            num = res;
        }
        return num;
    }
}
