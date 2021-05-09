package aliyun.tianchi.No_67;

public class B {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        // Write your code here
        return (int) Math.ceil(Math.log(buckets) / Math.log(minutesToTest / minutesToDie + 1));
    }
}
