package leetcode.weekly_contest._89;

import java.util.Arrays;
import java.util.Comparator;

public class B {
    class Solution {
        public int carFleet(int target, int[] position, int[] speed) {
            int N = position.length;
            Car[] cars = new Car[N];
            for (int i = 0; i < N; ++i)
                cars[i] = new Car(position[i], (double) (target - position[i]) / speed[i]);
            Arrays.sort(cars, Comparator.comparingInt(a -> a.position));

            int ans = 0, t = N;
            while (--t > 0) {
                if (cars[t].time < cars[t - 1].time) ans++;
                else cars[t - 1] = cars[t];
            }

            return ans + (t == 0 ? 1 : 0);
        }
    }

    class Car {
        int position;
        double time;

        Car(int p, double t) {
            position = p;
            time = t;
        }
    }
}
