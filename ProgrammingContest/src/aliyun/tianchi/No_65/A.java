package aliyun.tianchi.No_65;

public class A {
    public int BalancedSalesArray(int[] sales) {
        // write your code here
        int mid = sales.length >> 1;
        int left = 0;
        int right = 0;
        for (int i = 0; i < mid; i++) {
            left += sales[i];
        }
        for (int i = mid + 1; i < sales.length; i++) {
            right += sales[i];
        }
        //题目保证一定有解，否则需要注意边界
        while(left != right){
            if(left < right){
                left += sales[mid];
                right -= sales[mid + 1];
                mid++;
            }else {
                left -= sales[mid - 1];
                right += sales[mid];
                mid--;
            }
        }
        return mid;
    }
}
