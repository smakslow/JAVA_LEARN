package aliyun.tianchi.No_62;

public class A {
    public boolean ReachingPoints(int[] start, int[] target) {
        // write your code here
        if (start == target) return true;
        while (target[0] >= start[0] && target[1] >= start[1]) {
            if (target[0] == start[0])
            {
                if ((target[1] - start[0]) % start[0] == 0)
                    return true;
                else
                    target[1] -= start[0];
            } else if (target[1] == start[1]) {
                if ((target[0] - start[1]) % start[1] == 0)
                    return true;
                else
                    target[0] -= start[1];
            } else if (target[0] > target[1])
                target[0] -= target[1];
            else
                target[1] -= target[0];
        }
        return false;
    }
}
