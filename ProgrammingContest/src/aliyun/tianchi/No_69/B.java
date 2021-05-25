package aliyun.tianchi.No_69;

import java.util.HashMap;

public class B {
    public int recommendFriends(int[][] friends, int user) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int u : friends[user]) {
            map.put(u, 1);
        }
        int max = -1;
        int ans = friends.length + 1;
        for (int i = 0; i < friends.length; i++) {
            if (i == user || map.containsKey(i)) continue;
            int cnt = 0;
            for (int j = 0; j < friends[i].length; j++) {
                if (map.containsKey(friends[i][j])) cnt++;
            }
            if (cnt == 0) continue;
            if (cnt > max) {
                ans = i;
                max = cnt;
            } else if (cnt == max && ans > i) {
                ans = i;
            }
        }

        return ans == friends.length + 1 ? -1 : ans;
    }
}
