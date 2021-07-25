package leetcode.daily;

import java.util.HashMap;
import java.util.TreeMap;

public class _981 {
    class TimeMap {

        /** Initialize your data structure here. */
        HashMap<String, TreeMap<Integer, String>> map;
        public TimeMap() {
            map = new HashMap();
        }

        public void set(String key, String value, int timestamp) {
            map.computeIfAbsent(key, k-> new TreeMap()).put(timestamp, value);
        }

        public String get(String key, int timestamp) {
            if(!map.containsKey(key)) {
                return "";
            }
            Integer time = map.get(key).floorKey(timestamp);
            if(time == null) {
                return "";
            }
            return map.get(key).get(time);
        }
    }
}
