package aliyun.tianchi.No_69;

import java.util.Arrays;

public class C {
    public int ParkingDilemma(int[] cars, int k) {
        // write your code here
        Arrays.sort(cars);
        int minRet = Integer.MAX_VALUE;
        for (int i = 0; i <= cars.length - k; i++) {
            int dis = cars[i + k - 1] - cars[i] + 1;
            if (dis < minRet) {
                minRet = dis;
            }
        }
        return minRet;
    }
}
