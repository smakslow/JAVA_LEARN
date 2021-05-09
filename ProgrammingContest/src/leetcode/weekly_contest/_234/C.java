package leetcode.weekly_contest._234;

import java.util.HashMap;
import java.util.List;

public class C {
    class Solution {
        public String evaluate(String s, List<List<String>> knowledge) {
            HashMap<String, String> map = new HashMap<>();
            for (List<String> str : knowledge) {
                map.put(str.get(0), str.get(1));
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder temp;
            int begin = 0;
            while (begin < s.length()) {
                if (Character.isLetter(s.charAt(begin))) {
                    sb.append(s.charAt(begin));
                    begin++;
                } else {
                    begin++;
                    temp = new StringBuilder();
                    while (begin < s.length() && Character.isLetter(s.charAt(begin))) {
                            temp.append(s.charAt(begin));
                            begin++;
                    }
                    begin++;
                    sb.append(map.getOrDefault(temp.toString(), "?"));
                }
            }
            return  sb.toString();
        }
    }
}
