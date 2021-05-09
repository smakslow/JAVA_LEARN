package aliyun.tianchi.No_65;

public class D {
    public int minimumtimes(int n) {
        // Write your code here
        int ans  = 0;
        int z = 1;
        while(z < n){
            z *= 3;
            ans++;
        }
        return ans;
    }
}
