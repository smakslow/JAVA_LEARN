package leetcode.weekly_contest._262;

import java.util.TreeMap;

public class C {
    class StockPrice {
        TreeMap<Integer, Integer> map;   //timestamp, price
        TreeMap<Integer, Integer> prices; // price , cnt

        public StockPrice() {
            map = new TreeMap<>();
            prices = new TreeMap<>();
        }

        public void update(int timestamp, int price) {
            if (map.containsKey(timestamp)) {
                int p = map.get(timestamp);
                if (prices.containsKey(p)) {
                    int cnt = prices.get(p);
                    if (cnt <= 1) prices.remove(p);
                    else
                        prices.put(p, cnt - 1);
                }
            }
            prices.put(price, prices.getOrDefault(price, 0) + 1);
            map.put(timestamp, price);
        }

        public int current() {
            return map.lastEntry().getValue();
        }

        public int maximum() {
            return prices.lastKey();
        }

        public int minimum() {
            return prices.firstKey();
        }
    }
}
