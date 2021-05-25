package aliyun.tianchi.No_69;

import java.util.HashSet;

public class D {
    private int solution(String str) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            int left = i - 1, right = i + 1;
            while (left >= 0 && right < str.length()) {
                if (str.charAt(left) == str.charAt(right)) {
                    left--;
                    right++;
                } else {
                    break;
                }
            }
            set.add(str.substring(left, right));
            left = i;
            right = i + 1;
            while (left >= 0 && right < str.length()) {
                if (str.charAt(left) == str.charAt(right)) {
                    left--;
                    right++;
                } else {
                    break;
                }
            }
            set.add(str.substring(left, right));
        }
        return set.size();
    }
}
