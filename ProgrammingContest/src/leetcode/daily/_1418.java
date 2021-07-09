package leetcode.daily;

import java.util.*;

public class _1418 {
    class Solution {
        public List<List<String>> displayTable(List<List<String>> orders) {
            List<List<String>> ans = new ArrayList<>();
            HashMap<String, HashMap<String, Integer>> map = new HashMap<>();
            HashMap<String, Integer> tmp;
            HashSet<String> set = new HashSet<>();
            for (List<String> order : orders) {
                String table = order.get(1);
                String food = order.get(2);
                set.add(food);
                if(map.containsKey(table)){
                    tmp = map.get(table);
                    tmp.put(food,tmp.getOrDefault(food,0) + 1);
                    map.replace(table,tmp);
                }else{
                    tmp = new HashMap<>();
                    tmp.put(food,1);
                    map.put(table,tmp);
                }
            }
            LinkedList<String> foodName = new LinkedList<>(set);
            foodName.sort(Comparator.naturalOrder());
            foodName.addFirst("Table");
            List<String>  list;
            for (Map.Entry<String, HashMap<String, Integer>> entry : map.entrySet()) {
                String key = entry.getKey();
                HashMap<String, Integer> value = entry.getValue();
                list  = new ArrayList<>();
                list.add(key);
                for (int j = 1; j < foodName.size(); j++) {
                    String name = foodName.get(j);
                    list.add(String.valueOf(value.getOrDefault(name,0)));
                }
                ans.add(list);
            }
            ans.sort(Comparator.comparingInt(o -> Integer.parseInt(o.get(0))));
            ans.add(0,foodName);
            return ans;
        }
    }
}
